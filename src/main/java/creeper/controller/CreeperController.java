package creeper.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import creeper.service.impl.CreeperService;
import store.TestCrawler;

@Controller
@RequestMapping("/creeper/")
public class CreeperController {
	@Autowired
	private CreeperService creeperService;
	/**
	 * 开始爬取
	 * @Title: startCreeper
	 * @Description: 
	 * @param 
	 * @return void 
	 * @throws Exception 
	 * @throws
	 * @author 小银龙
	 * @2015年10月31日 上午11:50:14
	 */
	@RequestMapping("startCreeper")
	public void startCreeper() throws Exception {
		System.out.println("开始爬取=================");
		Long start = System.currentTimeMillis();
		for(int i=1; i<=3524; i++) {
			TestCrawler crawler = new TestCrawler("/home",true);
			crawler.setThreads(50);
			crawler.addSeed("http://sh.lianjia.com/ershoufang/pg" + i);
			crawler.setResumable(false);
			crawler.setTopN(100);
			crawler.start(i);
			creeperService.saveInternetContent(crawler.getInternetContent());
		}
		Long end = System.currentTimeMillis();
		System.out.println("耗时：" + (end-start));
		System.out.println("结束爬取=================");
	}
}
