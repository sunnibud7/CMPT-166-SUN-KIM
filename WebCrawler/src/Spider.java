/** @author Sun Kim 
 * Web Crawler Project for CMPT 160 
 * Professor Herbert T. Tsang
 * Got help and directions from http://www.netinstructions.com/how-to-make-a-simple-web-crawler-in-java/
 * This Java Web Crawler will find and search for the word within the given Web page and print out the results
 * 10 URL and word counts per URL.*/

import java.util.*;

public class Spider 
{
	// Sets the maximum number of pages to search, Web Crawler will stop after finding 10 different URLs.
	private static final int MAX_PAGES_TO_SEARCH = 10;
	
	// Use Set to make sure there isn't any duplicates
	private Set<String> pagesVisited = new HashSet<String>();
	
	// Store bunch of URLs we have to visit next
	private List<String> pagesToVisit = new LinkedList<String>();
	
	private String nextUrl()
	{
		String nextUrl;
		
		do
		{
			nextUrl = this.pagesToVisit.remove(0);
		}
		// While this page is in the nextUrl
		while(this.pagesVisited.contains(nextUrl));
		
		// Add the URL to the pageVisited Set
		this.pagesVisited.add(nextUrl);
		
		return nextUrl;
	}
	
	public void search(String url, String searchWord)
	{
		// The program will run until it reaches the max pages that I set to run. (In this case, 10 web pages)
		while(this.pagesVisited.size() < MAX_PAGES_TO_SEARCH)
		{
			String currentUrl;
			SpiderLeg leg = new SpiderLeg();
			
			// If the page visiting is a new page, adds the URL to the pagesVisited linked list.
			if(this.pagesToVisit.isEmpty())
			{
				currentUrl = url;
				this.pagesVisited.add(url);
			}
			// Otherwise Keep crawling
			else
			{
				currentUrl = this.nextUrl();
			}
			leg.crawl(currentUrl);
			
			//If the word you searching for is there
			boolean success = leg.searchForWord(searchWord);
			
			// Successful Crawling then print this and show the searched word and the URL.
			if(success)
			{
				System.out.println(String.format("Success! Word %s found at %s", searchWord, currentUrl));
				
				break;
			}
			this.pagesToVisit.addAll(leg.getLinks());
		}
		System.out.println(String.format("Done! Visited %s web pages(s)", this.pagesVisited.size()));
		
	}
}
