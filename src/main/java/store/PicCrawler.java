package store;

import java.text.SimpleDateFormat;
import java.util.Date;

import cn.edu.hfut.dmic.webcollector.crawler.BreadthCrawler;
import cn.edu.hfut.dmic.webcollector.model.Links;
import cn.edu.hfut.dmic.webcollector.model.Page;
import cn.edu.hfut.dmic.webcollector.util.FileUtils;
import store.util.CommonUtil;
import store.util.Constant;

public class PicCrawler extends BreadthCrawler {
	public PicCrawler(String crawlPath, boolean autoParse) {
		super(crawlPath, autoParse);
	}

	@Override
	public void visit(Page page, Links arg1) {
		//校验是否图片
		/*if(StringUtil.isBlank(Constant.getImgTypeMap(page.getUrl().substring(page.getUrl().lastIndexOf(".")+1)))) {
			System.out.println("不是图片："+page.getUrl());
			return;
		}*/
        try {
        	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        	String descPath = Constant.imgPath + sdf.format(new Date()) + "_" + CommonUtil.getRandomStr(6) +".jpg";
            FileUtils.writeFileWithParent(descPath, page.getContent());
            System.out.println("copy:"+page.getUrl());
        } catch (Exception e) {
        	System.out.println("图片copy出错："+page.getUrl());
            e.printStackTrace();
        }
	}

}
