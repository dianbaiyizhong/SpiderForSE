package com.hhm.searchengine.spiderforse.queue;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class UnvisitedUrl {
	private static Set<Seed> unVisitedUrl = new HashSet<Seed>();

	private static final UnvisitedUrl INSTANCE = new UnvisitedUrl();

	public synchronized static final UnvisitedUrl getInstance() {
		return UnvisitedUrl.INSTANCE;
	}

	public synchronized void set(Seed s) {

		unVisitedUrl.add(s);

	}

	public synchronized Seed getUrl() {
		synchronized (this) {

			Iterator it = unVisitedUrl.iterator();

			if (it.hasNext()) {
				Seed s = (Seed) it.next();

				it.remove();
				return s;

			}

			return null;
		}
	}

}
