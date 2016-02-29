package com.hhm.searchengine.spiderforse.vo;

import java.sql.Timestamp;

/**
 * PointMultipleRealTime entity. @author MyEclipse Persistence Tools
 */

public class PointMultipleRealTime implements java.io.Serializable {

	// Fields

	private Integer ampId;
	private Integer ampEventId;
	private Integer ampPoint;
	private Timestamp ampDate;
	private Boolean ampStatus;

	// Constructors

	/** default constructor */
	public PointMultipleRealTime() {
	}

	/** full constructor */
	public PointMultipleRealTime(Integer ampId, Integer ampEventId,
			Integer ampPoint, Timestamp ampDate, Boolean ampStatus) {
		this.ampId = ampId;
		this.ampEventId = ampEventId;
		this.ampPoint = ampPoint;
		this.ampDate = ampDate;
		this.ampStatus = ampStatus;
	}

	// Property accessors

	public Integer getAmpId() {
		return this.ampId;
	}

	public void setAmpId(Integer ampId) {
		this.ampId = ampId;
	}

	public Integer getAmpEventId() {
		return this.ampEventId;
	}

	public void setAmpEventId(Integer ampEventId) {
		this.ampEventId = ampEventId;
	}

	public Integer getAmpPoint() {
		return this.ampPoint;
	}

	public void setAmpPoint(Integer ampPoint) {
		this.ampPoint = ampPoint;
	}

	public Timestamp getAmpDate() {
		return this.ampDate;
	}

	public void setAmpDate(Timestamp ampDate) {
		this.ampDate = ampDate;
	}

	public Boolean getAmpStatus() {
		return this.ampStatus;
	}

	public void setAmpStatus(Boolean ampStatus) {
		this.ampStatus = ampStatus;
	}

}