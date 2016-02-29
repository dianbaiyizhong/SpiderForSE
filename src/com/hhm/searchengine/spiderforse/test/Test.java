package com.hhm.searchengine.spiderforse.test;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
	static DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	public static void main(String[] args) {

		String time = "2015-07-07 20:53:16.667";


		try {
			Date date = new Date();

			date = sdf.parse(time);

		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
