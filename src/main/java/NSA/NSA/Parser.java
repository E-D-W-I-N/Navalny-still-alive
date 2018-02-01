package NSA.NSA;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
public class Parser {

	private static Document getPage() throws MalformedURLException, IOException {
		String Url = "https://vk.com/public147377487";
		Document page = Jsoup.parse(new URL(Url), 3000);
		return page;
	}
	
	public static void main(String[] args) throws MalformedURLException, IOException {
		Document page = getPage();
		String Answer = page.selectFirst("div[class=wall_text]").text();
		System.out.println(" - Навального еще не убили?");
		System.out.println(" - " + Answer);

	}

}
