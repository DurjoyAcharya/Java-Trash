package NET;
import java.util.Scanner;
import java.util.ArrayList;
public class WeCrawler {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter URL: ");
		String url=input.nextLine();
		crawler(url);

	}

	public static void crawler(String startingurl) {
		ArrayList<String> listofpendingURLs=new ArrayList<>();
		ArrayList<String> listoftraversedURLs=new ArrayList<>();
		listofpendingURLs.add(startingurl);
		while(!listofpendingURLs.isEmpty()&&listoftraversedURLs.size()<=100) {
			String urlStarting=listofpendingURLs.remove(0);
			if(!listofpendingURLs.contains(urlStarting)) {
				listoftraversedURLs.add(urlStarting);
				System.out.println("Craw: "+urlStarting);
				for(String s: getSubURLs(urlStarting)) {
					if(!listoftraversedURLs.contains(s)) {
						listofpendingURLs.add(s);
					}
				}
			}
		}
	}	
	
	public static ArrayList<String> getSubURLs(String urlStarting){
		ArrayList<String> list = new ArrayList<>();
		try {
			java.net.URL url = new java.net.URL(urlStarting);
			Scanner sc=new Scanner(url.openStream());
			int current=0;
			while(sc.hasNext()) {
				String line=sc.nextLine();
				current = line.indexOf("http:", current);
				while (current > 0) {
					int endIndex = line.indexOf("\"", current);
					if (endIndex > 0) {
						list.add(line.substring(current, endIndex));
						current = line.indexOf("http:", endIndex);
					}
					else {
						current=-1;
						
					}
					}
				}
			}catch(Exception e) {
				System.out.println("This is : "+e.getMessage());
			}
		return list;		
		}
	}

