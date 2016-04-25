import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class SpiderLeg extends Spider
{
	
	// To make sure I do not get banned from the website I will be crawling for this Project
	private static final String USER_AGENT = "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/49.0.2623.110 Safari/537.36";
	
	// URL in String
	private List<String> links = new LinkedList<String>();
	// We will be crawling HTML web
	private Document htmlDocument;
	
	Connection connection = Jsoup.connect("http://www.google.com");
	public boolean crawl(String url)
	{
		try
		{
			// Attempts to establish a connection to given URL.
			Connection connection = Jsoup.connect(url).userAgent(USER_AGENT);
			Document htmlDocument = connection.get();
			this.htmlDocument = htmlDocument;
			
			if(connection.response().statusCode() == 200)
			{
			System.out.println("Received web page at " + url);
			}
			
			// If it is not an HTML Web
			if(!connection.response().contentType().contains("text/html"))
			{
				System.out.println("Failed, Retrived something other than HTML");
				return false;
			}
			
			Elements linksOnPage = htmlDocument.select("a[href]");
			System.out.println("Found (" + linksOnPage.size() + ") links");
			
			// a href is a placeholder for a hyper link, href atrrivute specifies the link's destination. 
			for(Element link : linksOnPage)
			{
				this.links.add(link.absUrl("href"));
			}
			return true;
		}
		
		catch(IOException ioe)
		{
			return false;
		}
	}
	
	// Search for word, lowercase or uppercase.
	public boolean searchForWord(String searchWord)
	{
		System.out.println("Searching for the word " + searchWord + "....");
		String bodyText = this.htmlDocument.body().text();
		return bodyText.toLowerCase().contains(searchWord.toLowerCase());
	}
	public List<String> getLinks()
	{
		return this.links;
	}
}
