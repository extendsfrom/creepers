package store.util;
import java.util.ArrayList;
import java.util.List;

import javax.swing.text.Document;

import org.springframework.beans.factory.annotation.Autowired;

import cn.edu.hfut.dmic.webcollector.model.Page;
import creeper.service.impl.CreeperService;
import store.TestCrawler;

public class CreeperUtil {
	private static List<String> allUrl = new ArrayList<String>();//所有url
	private static List<String> waitUrl = new ArrayList<String>();//未爬取的url
	private static final Object signal = new Object();
	private static int count = 0;
	private static int countThread = 1;
	private static int crawlerNum = 0;
	@Autowired
	private CreeperService creeperService;
	
	public static void startCreeper() {
		long start = System.currentTimeMillis();
		System.out.println("开始爬取=========================");
		CreeperUtil test = new CreeperUtil();
		test.begin();
		while(true) {
			if((waitUrl.isEmpty() && Thread.activeCount() == 1) || count == countThread) {
				long end = System.currentTimeMillis();
				System.out.println("总耗时：" + (end - start));
				System.out.println("爬取结束====================");
				System.exit(-1);
			}
		}
	}
	
	public void begin() {
		this.setWaitUrl();
		for(int i=0; i<countThread; i++) {
			new Thread(new Runnable() {
				public void run() {
					while(true) {
						String nowUrl = getUrl();
						if(null != nowUrl && !"".equals(nowUrl.trim())) {
							crawler(nowUrl);
						} else {
							synchronized(signal) {  
                                try {  
                                    count++;  
                                    System.out.println("当前有"+count+"个线程在等待");  
                                    signal.wait();  
                                } catch (InterruptedException e) {  
                                    e.printStackTrace();  
                                }  
                            }  
						}
					}
				}
			}, "Thread-" + i).start();
		}
	}
	
	private void setWaitUrl() {
		for(int i=0; i<10; i++) {
			allUrl.add("http://sh.lianjia.com/ershoufang/pg" + (i+1));
			waitUrl.add("http://sh.lianjia.com/ershoufang/pg" + (i+1));
		}
	}
	
	private String getUrl() {
		if(waitUrl.size() > 0) {
			String nowUrl =	waitUrl.remove(0);
			return nowUrl;
		} else {
			return null;
		}
	}
	
	private boolean crawler(String url) {
		try {
			crawlerNum ++;
			TestCrawler crawler = new TestCrawler("/home",true);
			crawler.setThreads(1);
			crawler.addSeed(url);
			crawler.setResumable(false);
			crawler.setTopN(100);
			crawler.start(waitUrl.size());
			creeperService.saveInternetContent(crawler.getInternetContent());
			System.out.println(crawlerNum + ":爬取成功：由" + Thread.currentThread().getName() + "爬取:" + url);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public void beginCreeper(String url) {
		try {
			TestCrawler crawler = new TestCrawler("/home",true);
			crawler.setThreads(50);
			crawler.addSeed(url);
			crawler.setResumable(false);
			crawler.setTopN(100);
			crawler.start(1);
			creeperService.saveInternetContent(crawler.getInternetContent());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
