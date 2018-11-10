package com.test;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class GetData {

	public static void main(String[] args) throws IOException {
		Document doc = Jsoup.connect("https://www.dx678.com/game/").get();
		System.out.println(doc);
	}

}
