package com.hhm.searchengine.spiderforse.vo;

import java.sql.Timestamp;

import com.hhm.searchengine.spiderforse.util.MD5;

/**
 * AnalysisSearchList entity. @author MyEclipse Persistence Tools
 */

public class AnalysisSearchList implements java.io.Serializable {

	// Fields

	private Integer aslId;


	@Override
	public String toString() {
		return "AnalysisSearchList [aslEventId=" + aslEventId
				+ ", aslPushDate=" + aslPushDate + ", aslTitle=" + aslTitle
				+ ", aslUrl=" + aslUrl + "]";
	}

	private Integer aslEventId;
	private String aslTitle;
	private String aslUrl;
	private String aslUrlMd5;
	private Timestamp aslPushDate;
	private Integer aslCount;
	private Timestamp aslSearchDate;

	// Constructors

	/** default constructor */
	public AnalysisSearchList() {
	}

	/** full constructor */
	public AnalysisSearchList(Integer aslId, Integer aslEventId,
			String aslTitle, String aslUrl, String aslUrlMd5,
			Timestamp aslPushDate, Integer aslCount, Timestamp aslSearchDate) {
		this.aslId = aslId;
		this.aslEventId = aslEventId;
		this.aslTitle = aslTitle;
		this.aslUrl = aslUrl;
		this.aslUrlMd5 = aslUrlMd5;
		this.aslPushDate = aslPushDate;
		this.aslCount = aslCount;
		this.aslSearchDate = aslSearchDate;
	}

	// Property accessors

	public Integer getAslId() {
		return this.aslId;
	}

	public void setAslId(Integer aslId) {
		this.aslId = aslId;
	}

	public Integer getAslEventId() {
		return this.aslEventId;
	}

	public void setAslEventId(Integer aslEventId) {
		this.aslEventId = aslEventId;
	}

	public String getAslTitle() {
		return this.aslTitle;
	}

	public void setAslTitle(String aslTitle) {
		this.aslTitle = aslTitle;
	}

	public String getAslUrl() {
		return this.aslUrl;
	}

	public void setAslUrl(String aslUrl) {
		this.aslUrl = aslUrl;
		MD5 md5 = new MD5();
		setAslUrlMd5(md5.MD5Encode(aslUrl));

	}

	public String getAslUrlMd5() {
		return this.aslUrlMd5;
	}

	public void setAslUrlMd5(String aslUrlMd5) {
		this.aslUrlMd5 = aslUrlMd5;
	}

	public Timestamp getAslPushDate() {
		return this.aslPushDate;
	}

	public void setAslPushDate(Timestamp aslPushDate) {
		this.aslPushDate = aslPushDate;
	}

	public Integer getAslCount() {
		return this.aslCount;
	}

	public void setAslCount(Integer aslCount) {
		this.aslCount = aslCount;
	}

	public Timestamp getAslSearchDate() {
		return this.aslSearchDate;
	}

	public void setAslSearchDate(Timestamp aslSearchDate) {
		this.aslSearchDate = aslSearchDate;
	}

}