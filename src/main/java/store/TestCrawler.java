package store;

import java.util.List;
import java.util.Map;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import cn.edu.hfut.dmic.webcollector.crawler.BreadthCrawler;
import cn.edu.hfut.dmic.webcollector.model.Links;
import cn.edu.hfut.dmic.webcollector.model.Page;
import store.util.ParseContextUtil;

public class TestCrawler extends BreadthCrawler{
	private List<Map<String, String>> internetContent = null;
	public TestCrawler(String crawlPath, boolean autoParse) {
		super(crawlPath, autoParse);
	}

	@Override
	public void visit(Page page, Links arg1) {
		Document doc = page.getDoc();
		//FileUtil.writeFromStr(doc.html());
		Element houseElem = doc.getElementById("house-lst");
		//解析房屋信息
		internetContent = ParseContextUtil.parseDict(houseElem);
	}
	
	public List<Map<String, String>> getInternetContent() {
		return internetContent;
	}
	
	public static void main(String[] args) throws Exception {
		/*第一个参数是爬虫的crawlPath，crawlPath是维护URL信息的文件夹的路径，如果爬虫需要断点爬取，每次请选择相同的crawlPath
                    第二个参数表示是否自动抽取符合正则的链接并加入后续任务*/
		TestCrawler crawler = new TestCrawler("/home",true);
	    crawler.setThreads(50);
	    crawler.addSeed("http://sh.lianjia.com/ershoufang/pg1");
	    crawler.setResumable(false);
	    /*设置是否断点爬取*/
	    crawler.setResumable(false);
	    /*设置每层爬取爬取的最大URL数量*/
	    crawler.setTopN(100);
	    /*如果希望尽可能地爬取，这里可以设置一个很大的数，爬虫会在没有待爬取URL时自动停止*/
	    crawler.start(1);	
	}
	
}
