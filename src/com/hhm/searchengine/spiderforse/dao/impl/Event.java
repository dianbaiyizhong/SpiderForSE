package com.hhm.searchengine.spiderforse.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hhm.searchengine.spiderforse.dao.HibernateSessionFactory;

public class Event {

	public List get() {
		Session session = HibernateSessionFactory.getSession();
		Transaction tx = session.beginTransaction();
		Query query = session.createQuery("from EventList");

		List list = query.list();

		session.close();

		return list;

	}

}
