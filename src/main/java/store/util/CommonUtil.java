package store.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class CommonUtil {
	private static Map<String, String> houseStyle = null;
	private static Map<String, String> houseToward = null;
	private static Map<String, String> houseType = null;
	private static Map<String, String> taxFree = null;
	private static Map<String, String> isUnique = null;
	
	public static String getRandomStr(int length) {
		String base = "abcdefghijklmnopqrestuvwxyzABCDEFGHIJKLMNOPQRESTUVWXYZ0123456789";
		StringBuffer sBuffer = new StringBuffer();
		Random random = new Random();
		for(int i=0; i<length; i++) {
			sBuffer.append(base.charAt(random.nextInt(base.length())));
		}
		return sBuffer.toString();
	}
	
	public static Map<String, String> getHouseStyle() {
		if(null == houseStyle) {
			houseStyle = new HashMap<String, String>();
			houseStyle.put("1室0厅", "0000");
			houseStyle.put("1室1厅", "0001");
			houseStyle.put("1室2厅", "0002");
			houseStyle.put("1室3厅", "0003");
			houseStyle.put("1室4厅", "0004");
			houseStyle.put("1室5厅", "0005");
			houseStyle.put("1室6厅", "0006");
			houseStyle.put("1室7厅", "0007");
			houseStyle.put("1室8厅", "0008");
			houseStyle.put("1室9厅", "0009");

			houseStyle.put("2室0厅", "0100");
			houseStyle.put("2室1厅", "0101");
			houseStyle.put("2室2厅", "0102");
			houseStyle.put("2室3厅", "0103");
			houseStyle.put("2室4厅", "0104");
			houseStyle.put("2室5厅", "0105");
			houseStyle.put("2室6厅", "0106");
			houseStyle.put("2室7厅", "0107");
			houseStyle.put("2室8厅", "0108");
			houseStyle.put("2室9厅", "0109");

			houseStyle.put("3室0厅", "0200");
			houseStyle.put("3室1厅", "0201");
			houseStyle.put("3室2厅", "0202");
			houseStyle.put("3室3厅", "0203");
			houseStyle.put("3室4厅", "0204");
			houseStyle.put("3室5厅", "0205");
			houseStyle.put("3室6厅", "0206");
			houseStyle.put("3室7厅", "0207");
			houseStyle.put("3室8厅", "0208");
			houseStyle.put("3室9厅", "0209");
			
			houseStyle.put("4室0厅", "0300");
			houseStyle.put("4室1厅", "0301");
			houseStyle.put("4室2厅", "0302");
			houseStyle.put("4室3厅", "0303");
			houseStyle.put("4室4厅", "0304");
			houseStyle.put("4室5厅", "0305");
			houseStyle.put("4室6厅", "0306");
			houseStyle.put("4室7厅", "0307");
			houseStyle.put("4室8厅", "0308");
			houseStyle.put("4室9厅", "0309");
			
			houseStyle.put("5室0厅", "0400");
			houseStyle.put("5室1厅", "0401");
			houseStyle.put("5室2厅", "0402");
			houseStyle.put("5室3厅", "0403");
			houseStyle.put("5室4厅", "0404");
			houseStyle.put("5室5厅", "0405");
			houseStyle.put("5室6厅", "0406");
			houseStyle.put("5室7厅", "0407");
			houseStyle.put("5室8厅", "0408");
			houseStyle.put("5室9厅", "0409");
			
			houseStyle.put("6室0厅", "0500");
			houseStyle.put("6室1厅", "0501");
			houseStyle.put("6室2厅", "0502");
			houseStyle.put("6室3厅", "0503");
			houseStyle.put("6室4厅", "0504");
			houseStyle.put("6室5厅", "0505");
			houseStyle.put("6室6厅", "0506");
			houseStyle.put("6室7厅", "0507");
			houseStyle.put("6室8厅", "0508");
			houseStyle.put("6室9厅", "0509");
			
			houseStyle.put("7室0厅", "0600");
			houseStyle.put("7室1厅", "0601");
			houseStyle.put("7室2厅", "0602");
			houseStyle.put("7室3厅", "0603");
			houseStyle.put("7室4厅", "0604");
			houseStyle.put("7室5厅", "0605");
			houseStyle.put("7室6厅", "0606");
			houseStyle.put("7室7厅", "0607");
			houseStyle.put("7室8厅", "0608");
			houseStyle.put("7室9厅", "0609");
			
			houseStyle.put("8室0厅", "0700");
			houseStyle.put("8室1厅", "0701");
			houseStyle.put("8室2厅", "0702");
			houseStyle.put("8室3厅", "0703");
			houseStyle.put("8室4厅", "0704");
			houseStyle.put("8室5厅", "0705");
			houseStyle.put("8室6厅", "0706");
			houseStyle.put("8室7厅", "0707");
			houseStyle.put("8室8厅", "0708");
			houseStyle.put("8室9厅", "0709");
			
			houseStyle.put("9室0厅", "0800");
			houseStyle.put("9室1厅", "0801");
			houseStyle.put("9室2厅", "0802");
			houseStyle.put("9室3厅", "0803");
			houseStyle.put("9室4厅", "0804");
			houseStyle.put("9室5厅", "0805");
			houseStyle.put("9室6厅", "0806");
			houseStyle.put("9室7厅", "0807");
			houseStyle.put("9室8厅", "0808");
			houseStyle.put("9室9厅", "0809");
		} 
		return houseStyle;
	}
	
	public static Map<String, String> getHosueTward() {
		if(null == houseToward) {
			houseToward = new HashMap<String, String>();
			houseToward.put("北", "00");
			houseToward.put("东", "01");
			houseToward.put("东北", "02");
			houseToward.put("东南", "03");
			houseToward.put("东西", "04");
			houseToward.put("南", "05");
			houseToward.put("南北", "06");
			houseToward.put("西", "07");
			houseToward.put("西北", "08");
			houseToward.put("西南", "09");
		}
		return houseToward;
	}
	
	public static Map<String, String> getHosueType() {
		if(null == houseType) {
			houseType = new HashMap<String, String>();
		}
		return houseType;
	}
	public static Map<String, String> getTaxFree() {
		if(null == taxFree) {
			taxFree = new HashMap<String, String>();
			taxFree.put("满五年唯一", "00");
		}
		return taxFree;
	}
	public static Map<String, String> getIsUnique() {
		if(null == isUnique) {
			isUnique = new HashMap<String, String>();
			isUnique.put("独家", "1");
		}
		return isUnique;
	}
}
