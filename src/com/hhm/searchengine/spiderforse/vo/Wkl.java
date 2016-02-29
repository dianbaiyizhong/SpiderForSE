package com.hhm.searchengine.spiderforse.vo;

import java.sql.Timestamp;

/**
 * Wkl entity. @author MyEclipse Persistence Tools
 */

public class Wkl implements java.io.Serializable {

	// Fields

	private Integer id;
	private String title;
	private String url;
	private Integer comment;
	private Timestamp pushDate;
	private Integer site;

	// Constructors

	/** default constructor */
	public Wkl() {
	}

	/** full constructor */
	public Wkl(Integer id, String title, String url, Integer comment,
			Timestamp pushDate, Integer site) {
		this.id = id;
		this.title = title;
		this.url = url;
		this.comment = comment;
		this.pushDate = pushDate;
		this.site = site;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Integer getComment() {
		return this.comment;
	}

	public void setComment(Integer comment) {
		this.comment = comment;
	}

	public Timestamp getPushDate() {
		return this.pushDate;
	}

	public void setPushDate(Timestamp pushDate) {
		this.pushDate = pushDate;
	}

	public Integer getSite() {
		return this.site;
	}

	public void setSite(Integer site) {
		this.site = site;
	}

}