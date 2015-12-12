package store.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
public class ParseContextUtil {

	/**
	 * @Title: parseDict
	 * @Description: 解析房屋信息
	 * @param @param elems
	 * @param @return
	 * @return List<String> 
	 * @throws
	 * @author 小银龙
	 * @2015年10月26日 下午9:44:30
	 */
	public static List<Map<String, String>> parseDict(Element houseElem) {
		List<Map<String, String>> internetList = null;
		if(null != houseElem) {
			List<Element> itemList = houseElem.children();
			if(!itemList.isEmpty()) {
				internetList = new ArrayList<Map<String, String>>();
				for(Element houseItem : itemList) {
					/**
					 * 图片地址;图片地址|房屋标题|小区|户型|面积|朝向|位置|楼层|建造年份|学区|地铁|缴纳契税|房源|总价|单价|看房人数
					 */
					Map<String, String> itemMap = new HashMap<String, String>();
					Elements imgs = houseItem.getElementsByTag("img");
					Elements region = houseItem.getElementsByClass("region");
					Elements zone = houseItem.getElementsByClass("zone");
					Elements meters = houseItem.getElementsByClass("meters");
					Element toward = houseItem.getElementsByClass("where").get(0).getAllElements().last();
					Elements con = houseItem.getElementsByClass("con");
					
					Elements fang05 = houseItem.getElementsByClass("fang05-ex");
					Elements fang_subway = houseItem.getElementsByClass("fang-subway-ex");
					Elements taxfree = houseItem.getElementsByClass("taxfree-ex");
					Elements unique = houseItem.getElementsByClass("unique-ex");
					Elements price = houseItem.getElementsByClass("price");
					Elements price_pre = houseItem.getElementsByClass("price-pre");
					Elements num = houseItem.getElementsByClass("num");
					itemMap.put("cPicPath", imgs.get(0).attr("data-img") + ";" + imgs.get(0).attr("data-apart-layout"));
					itemMap.put("cHouseName", imgs.get(0).attr("alt"));
					itemMap.put("cPlotName", region.get(0).text());
					itemMap.put("cHouseStyle", CommonUtil.getHouseStyle().get(zone.get(0).text()));
					itemMap.put("iHouseSpace", meters.get(0).text().replace("平米", "").trim());
					itemMap.put("cToward", CommonUtil.getHosueTward().get(toward.text()));
					itemMap.put("cAddress", con.get(0).text().split("/")[0]);
					itemMap.put("cFloor", con.get(0).text().split("/")[1]);
					itemMap.put("cBuildYear", con.get(0).text().split("/")[2].replace("年建", "").trim());
					
					if(null != fang05 && fang05.size() != 0) {
						itemMap.put("cNearSchoolDesc", fang05.get(0).text());
					} else {
						itemMap.put("cNearSchoolDesc", "");
					}
					if(null != fang_subway && fang_subway.size() != 0) {
						itemMap.put("cNearSubwayDesc", fang_subway.get(0).text());
					} else {
						itemMap.put("cNearSubwayDesc", "");
					}
					if(null != taxfree && taxfree.size() != 0) {
						itemMap.put("cTaxFree", CommonUtil.getTaxFree().get(taxfree.get(0).text()));
					} else {
						itemMap.put("cTaxFree", "");
					}
					itemMap.put("cHouseType", "00");
					if(null != unique && unique.size() != 0) {
						itemMap.put("cIsUnique", "独家".equals(unique.get(0).text()) ? "1" : "0");
					} else {
						itemMap.put("cIsUnique", "0");
					}
					itemMap.put("cPriceAll", price.get(0).text());
					itemMap.put("cPrice", price_pre.get(0).text().substring(0, price_pre.get(0).text().lastIndexOf("/")).replace("元", "").trim());
					itemMap.put("cVisitNum", num.get(0).text());
					internetList.add(itemMap);
				}
			}
		}
		return internetList;
	}
}
