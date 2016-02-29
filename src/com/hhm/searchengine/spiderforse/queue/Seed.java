package com.hhm.searchengine.spiderforse.queue;

import java.sql.Timestamp;

import com.hhm.searchengine.spiderforse.util.MD5;

public class Seed {

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((md5 == null) ? 0 : md5.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Seed other = (Seed) obj;
		if (md5 == null) {
			if (other.md5 != null)
				return false;
		} else if (!md5.equals(other.md5))
			return false;
		return true;
	}

	private String md5;
	private String url;
	private Timestamp eventStart;
	private Timestamp eventExp;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getEventId() {
		return eventId;
	}

	public void setEventId(int eventId) {
		this.eventId = eventId;
	}

	private String title;
	private int eventId;

	public String getMd5() {
		return md5;
	}

	public void setMd5(String md5) {
		this.md5 = md5;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
		MD5 md5 = new MD5();
		setMd5(md5.MD5Encode(url));
	}

	public Timestamp getEventStart() {
		return eventStart;
	}

	public void setEventStart(Timestamp eventStart) {
		this.eventStart = eventStart;
	}

	public Timestamp getEventExp() {
		return eventExp;
	}

	public void setEventExp(Timestamp eventExp) {
		this.eventExp = eventExp;
	}

}
