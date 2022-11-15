package test;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CrawlingEx_1 {

	public static void main(String[] args) throws Exception {
		String url = "https://sports.news.naver.com/volleyball/index";
		Document doc = null;
		
		// 그 페이지의 모든 정보 가져오기
		doc = Jsoup.connect(url).get();
//		System.out.println(doc);
		
		// 추천 뉴스에 있는 모든 정보 가져오기
		Elements es = doc.select("div.home_news"); // . -> class, # -> id
//		System.out.println(es);
		
		String name = es.select("h2").text(); // h2에 있는 text 가져오기
		System.out.println(name);
		System.out.println("============================================================================================");
		
		// es에서 li들을 가져와서 e에 넣고 e에 있는 text 출력
		for (Element e : es.select("li")) {
			System.out.println(e.text());
		}
	}

}
