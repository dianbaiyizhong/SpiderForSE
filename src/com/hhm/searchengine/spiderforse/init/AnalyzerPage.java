package com.hhm.searchengine.spiderforse.init;

import java.sql.Timestamp;

import com.hhm.searchengine.spiderforse.queue.Seed;
import com.hhm.searchengine.spiderforse.queue.UnvisitedUrl;
import com.hhm.searchengine.spiderforse.vo.EventList;

public class AnalyzerPage {

	int maxPageCount = 300;
	static UnvisitedUrl U = new UnvisitedUrl().getInstance();

	public void set360(EventList list) {

		for (int i = 0; i < maxPageCount; i++) {
			String seedurl = "http://news.haosou.com/ns?q="
					+ list.getEventKeyword() + "&pn=" + i
					+ "&tn=news&rank=rank&j=0";
			Seed seed = new Seed();
			seed.setEventStart(list.getEventStart());
			seed.setEventExp(list.getEventExp());
			seed.setUrl(seedurl);
			seed.setEventId(list.getEventId());
			seed.setTitle(list.getEventTitle());
			U.set(seed);
		}

	}

}
