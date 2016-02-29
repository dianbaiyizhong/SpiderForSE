package com.hhm.searchengine.spiderforse.dao.impl;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hhm.searchengine.spiderforse.dao.HibernateSessionFactory;

public class ContentDao {
	public void Add(com.hhm.searchengine.spiderforse.vo.Content content) {

		Session session = HibernateSessionFactory.getSession();
		Transaction tx = session.beginTransaction();
		tx.begin();
		session.saveOrUpdate(content);
		tx.commit();
		System.out.println(content.toString());

		session.close();

	}
}
