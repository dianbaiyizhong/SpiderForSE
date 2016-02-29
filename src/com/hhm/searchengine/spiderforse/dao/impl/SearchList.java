package com.hhm.searchengine.spiderforse.dao.impl;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hhm.searchengine.spiderforse.dao.HibernateSessionFactory;
import com.hhm.searchengine.spiderforse.vo.AnalysisSearchList;

public class SearchList {

	public boolean isExistSameTimeAndAddOne(AnalysisSearchList asl) {
		Session session = HibernateSessionFactory.getSession();
		Query query = session
				.createQuery("from AnalysisSearchList where Asl_EventId =? and Asl_PushDate=?");
		query.setInteger(0, asl.getAslEventId());

		query.setString(1, asl.getAslPushDate().toString());
		List list = query.list();

		session.close();
		// 证明已经存在该天的数据，只需要加1就可以了
		if (list.size() == 1) {
			AnalysisSearchList asl_new = new AnalysisSearchList();
			asl_new = (AnalysisSearchList) list.get(0);

			int count = asl_new.getAslCount() + 1;
			asl_new.setAslCount(count);

			update(asl_new);

			return true;

		} else {

			return false;

		}

	}

	public void Add(AnalysisSearchList asl) {
		// 获取本地日期

		Date date = new Date();
		Timestamp searchTime = new Timestamp(date.getTime());
		asl.setAslSearchDate(searchTime);
		asl.setAslCount(1);
		Session session = HibernateSessionFactory.getSession();
		Transaction tx = session.beginTransaction();
		tx.begin();

		session.saveOrUpdate(asl);
		tx.commit();

		System.out.println(asl.toString());

		session.close();

	}

	public void update(AnalysisSearchList asl) {

		Session session = HibernateSessionFactory.getSession();
		Transaction tx = session.beginTransaction();

		session.update(asl);
		tx.commit();
		session.close();
	}

}
