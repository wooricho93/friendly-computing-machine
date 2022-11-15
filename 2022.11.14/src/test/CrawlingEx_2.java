package test;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CrawlingEx_2 {

	public static void main(String[] args) throws Exception {
		String url = "https://finance.naver.com/item/main.naver?code=005930";
		Document doc = null;
		
		doc = Jsoup.connect(url).get();
//		System.out.println(doc);
		
		Elements es = doc.select("div.wrap_company");
//		System.out.println(es);
		
		Element e = es.get(0);
		
		String name = es.select("h2").text();
		String id = e.select("span.code").text();
		
		
		System.out.println(name + "(" + id + ")");
	}

}
