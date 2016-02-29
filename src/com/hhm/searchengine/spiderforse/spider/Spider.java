package com.hhm.searchengine.spiderforse.spider;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

import com.hhm.searchengine.spiderforse.config.Config;
import com.hhm.searchengine.spiderforse.dao.impl.Event;
import com.hhm.searchengine.spiderforse.gather.Gather;
import com.hhm.searchengine.spiderforse.init.AnalyzerPage;
import com.hhm.searchengine.spiderforse.queue.Seed;
import com.hhm.searchengine.spiderforse.queue.UnvisitedUrl;
import com.hhm.searchengine.spiderforse.vo.EventList;

public class Spider {
	static UnvisitedUrl U = new UnvisitedUrl().getInstance();
	static Config config = new Config();

	public void start() {

		config.setSE_NAME("360");
		Event event = new Event();

		List<EventList> list = new ArrayList<EventList>();
		list = event.get();
		for (int i = 0; i < list.size(); i++) {

			System.out.println("正在装载舆情事件:" + list.get(i).getEventTitle());
			if (config.getSE_NAME().equals("360")) {
				AnalyzerPage ap = new AnalyzerPage();
				ap.set360(list.get(i));

			}
			System.out.println("开始获取网页内容");
			StartSpider();

		}

	}

	private static int maxThread = 1;
	private static ThreadPoolExecutor threadPool = (ThreadPoolExecutor) Executors
			.newFixedThreadPool(maxThread);

	private static void StartSpider() {

		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {

				while (true) {
					if (threadPool.getActiveCount() < maxThread) {

						List<Seed> codeList = new ArrayList<Seed>();
						for (int i = 0; i < 20; i++) {

							Seed seed = U.getUrl();
							if (seed != null) {

								codeList.add(seed);

							}

						}

						Gather gather = new Gather(codeList);

						threadPool.execute(gather);

					} else {
						try {
							Thread.sleep(8000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}

				}
			}

		});

		t.start();
	}

}
