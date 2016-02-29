package com.hhm.searchengine.spiderforse.gather;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import com.hhm.searchengine.spiderforse.analyzer.AnalyzerDomain;
import com.hhm.searchengine.spiderforse.config.Config;
import com.hhm.searchengine.spiderforse.dao.impl.SearchList;
import com.hhm.searchengine.spiderforse.queue.Seed;
import com.hhm.searchengine.spiderforse.spider.ParserTool;
import com.hhm.searchengine.spiderforse.vo.AnalysisSearchList;
import com.hhm.searchengine.spiderforse.vo.Content;

public class Gather implements Runnable {
	private List<Seed> list;

	static ParserTool parserTool = new ParserTool();
	static Config config = new Config();
	static SearchList searchList = new SearchList();
	static DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

	public Gather(List<Seed> list) {
		this.list = list;

	}

	@Override
	public void run() {
		if (config.getSE_NAME().equals("360")) {
			Analyzer360();

		}

	}

	public void Analyzer360() {

		for (int i = 0; i < list.size(); i++) {

			String codeSourse = parserTool.getSourseCode(list.get(i).getUrl());

			Document doc = Jsoup.parse(codeSourse);

			Elements e_ul = doc.select("ul[class=result]");

			if (e_ul.size() > 0) {
				Elements e_li = e_ul.select("li[class=res-list]");

				for (int j = 0; j < e_li.size(); j++) {

					String url = e_li.get(j).select("a").attr("href");
					String time = e_li.get(j).select("span[class=posttime]")
							.text();

					Calendar cl = Calendar.getInstance();
					cl = Calendar.getInstance();
					if (time.startsWith("昨天")) {

						String yesterDay = sdf.format(getBeforeDay(cl)
								.getTime());
						time = yesterDay;

					} else if (time.startsWith("今天")) {

						time = sdf.format(cl.getTime());

					} else if (time.contains("分钟") || time.contains("小时")) {
						time = sdf.format(cl.getTime());

					}

					// 先判断是否为任务指定日期
					if (IsTime(list.get(i), time)) {
						AnalysisSearchList asl = new AnalysisSearchList();
						try {
							asl.setAslPushDate(new Timestamp(sdf.parse(time)
									.getTime()));
						} catch (ParseException e) {
							e.printStackTrace();
						}
						asl.setAslTitle(list.get(i).getTitle());
						asl.setAslEventId(list.get(i).getEventId());
						asl.setAslUrl(url);
						// 判断是否存在该事件的事件，如果存在，就加1，不存在就新插一条

						if (searchList.isExistSameTimeAndAddOne(asl)) {

						} else {
							// 新插一条

							searchList.Add(asl);
						}


						// 解析地址
						Content content = new Content();
						content.setUrl(url);
						content.setEventId(list.get(i).getEventId());
						content.setKeyword(list.get(i).getTitle());
						AnalyzerDomain ad = new AnalyzerDomain();
						ad.Start(content);

					} else {

						// System.out.println("不符合条件日期范围");
					}

				}

			}

		}

	}

	public boolean IsTime(Seed seed, String time) {

		// System.out.println(seed.getEventStart() + "__" + time + "__"
		// + seed.getEventExp());
		Date date = new Date();

		try {

			date = sdf.parse(time);

		} catch (ParseException e) {
			e.printStackTrace();
		}

		if (date.getTime() >= seed.getEventStart().getTime()
				&& date.getTime() <= seed.getEventExp().getTime()) {
			return true;
		} else {
			return false;
		}

	}

	/**
	 * 获取当前时间的前一天时间
	 * 
	 * @param cl
	 * @return
	 */
	private static Calendar getBeforeDay(Calendar cl) {
		// 使用roll方法进行向前回滚
		// cl.roll(Calendar.DATE, -1);
		// 使用set方法直接进行设置
		int day = cl.get(Calendar.DATE);
		cl.set(Calendar.DATE, day - 1);
		return cl;
	}

	/**
	 * 设置时间
	 * 
	 * @param year
	 * @param month
	 * @param date
	 * @return
	 */
	public static Calendar setCalendar(int year, int month, int date) {
		Calendar cl = Calendar.getInstance();
		cl.set(year, month, date);
		return cl;
	}

}
