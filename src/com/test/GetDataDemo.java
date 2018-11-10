package com.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class GetDataDemo {

	public static void main(String[] args) throws Exception  {
	/*	String url = "https://www.dx678.com/static//data/50stat.json?tnum=630201&_=1500731730572";
		Runtime rt = Runtime.getRuntime();
		String exec = "D:/phantomjs-1.9.2-windows/phantomjs.exe E:/apache-tomcat-7.0.53/webapps/Automatically/js/test.js "+url;
		Process p = rt.exec(exec);
		InputStream is = p.getInputStream();
		Document doc = Jsoup.parse(is, "UTF-8", url);
		System.out.println(doc);*/
		Map<String,String> map =new HashMap<String,String>();
		map.put("__jsluid","c12d04336fac1b77043779da60e394df");
		map.put("JSESSIONID","aaaAL0tgnJ0AI4LOmQc1v");
		map.put("_skin_","blue");
		map.put("x-session-token","II2%2FV%2BdI2N8rjWr7Hn5ilyxazQJuLBiA5D0kN6UgkX%2FVlMcdF9jfkg%3D%3D");
		
		Document doc = Jsoup.connect("https://www.dx678.com/static/data/50stat.json")
				.ignoreContentType(true)
                //.data("query", "Java")
                .userAgent("Mozilla/5.0 (Windows NT 10.0) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/45.0.2454.101 Safari/537.36")
                .cookies(map)
                .timeout(3000)
                .get();
		
		System.out.println(doc.text());
		
	}

}
