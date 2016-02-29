package com.hhm.searchengine.spiderforse.spider;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class ParserTool {

	public String getSourseCode(String url) {
		String sourseCode = null;
		Document doc_sourseCode = null;
		try {
			doc_sourseCode = Jsoup.connect(url).timeout(60000).get();
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}

		sourseCode = doc_sourseCode.html();

		return sourseCode.trim() + "huanghaoming" + url;
	}

}
