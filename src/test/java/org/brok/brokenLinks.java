package org.brok;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class brokenLinks {
	
	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://makemysushi.com/");
		
		List<WebElement> hrf = driver.findElements(By.tagName("a"));
		System.out.println(hrf.size());
		
		
		for(WebElement x:hrf) {
			
			String str = x.getAttribute("href");

			URL url = new URL(str);
			
			
//			  switch (url.getProtocol()) {
//              case "http":
//              case "https":
//                //  HttpURLConnection httpConnection = (HttpURLConnection) url.openConnection();
//                  System.out.println("Connected to HTTP/HTTPS URL");
//                  // Add HTTP connection handling here
//                  break;
//
//              case "mailto":
//            	 // HttpURLConnection httpConnection1 = (HttpURLConnection) url.openConnection();
//               //   System.out.println("Email address: " + url.getPath());
//                  System.out.println("Unsupported protocol: " + url.getProtocol());
//                  System.out.println("Connected to mailto URL");
//                  // Add mailto-specific handling here
//                  break;
//              case "info":
//            	 // HttpURLConnection httpConnection2 = (HttpURLConnection) url.openConnection();
//                  System.out.println("Email address: " + url.getPath());
//                  System.out.println("Unsupported protocol: " + url.getProtocol());
//                  System.out.println("Connected to info URL");
//                  // Add mailto-specific handling here
//                  break;
//             
//              default:
//                 System.out.println("Unsupported protocol: " + url.getProtocol());
//                  System.out.println("Email address: " + url.getPath());
//          }
			
			//URL urlObject = new URL("mailto:example@example.com");
			//if("mailto".equals(url.getProtocol()))
			if ("https".equals(url.getProtocol()) || "http".equals(url.getProtocol())) {
			    String email = url.getPath(); // Extracts the email address
		    System.out.println("HTTPS : " + email);
			   
			}
			else if("mailto".equals(url.getProtocol())) {
				//URI mail = URI.create(str);
			//	System.out.println(mail);
			    String email = url.getPath(); // Extracts the email address
		    System.out.println("mailto : " + email);
			   
			}
		
			else
			{
				System.out.println("Unsupported protocol: " + url.getProtocol());
	          //  System.out.println("Email address: " + url.getPath());
			}
			
		
			
			URLConnection oc = url.openConnection();	
		 
			//java.net.HttpURLConnection connection = (java.net.HttpURLConnection) url.openConnection();
			
			javax.net.ssl.HttpsURLConnection http = (javax.net.ssl.HttpsURLConnection) oc;
			
		
						
		//	HttpURLConnection http = (HttpURLConnection) oc;
			
			
			
			int res = http.getResponseCode();
			
			
			System.out.println(str + "CODE :" + res);
			
			
		}
		
		
	
		
		
		
//		
//		  String url = "mailto:example@example.com";
//          URL urlObject = new URL(url);
//
//          switch (urlObject.getProtocol()) {
//              case "http":
//              case "https":
//                  HttpURLConnection httpConnection = (HttpURLConnection) urlObject.openConnection();
//                  System.out.println("Connected to HTTP/HTTPS URL");
//                  // Add HTTP connection handling here
//                  break;
//
//              case "mailto":
//                  System.out.println("Email address: " + urlObject.getPath());
//                  // Add mailto-specific handling here
//                  break;
//
//              default:
//                  System.out.println("Unsupported protocol: " + urlObject.getProtocol());
//          }
//		        HttpsURLConnection httpClient = (HttpsURLConnection) new URL(url).openConnection();

	}

}
