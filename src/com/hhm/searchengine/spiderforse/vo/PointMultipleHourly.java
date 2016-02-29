package com.hhm.searchengine.spiderforse.vo;

import java.sql.Timestamp;

/**
 * PointMultipleHourly entity. @author MyEclipse Persistence Tools
 */

public class PointMultipleHourly implements java.io.Serializable {

	// Fields

	private Integer mhpId;
	private Integer mhpEventId;
	private Integer mhpPoint;
	private Timestamp mhpDate;
	private Boolean mhpStatus;

	// Constructors

	/** default constructor */
	public PointMultipleHourly() {
	}

	/** full constructor */
	public PointMultipleHourly(Integer mhpId, Integer mhpEventId,
			Integer mhpPoint, Timestamp mhpDate, Boolean mhpStatus) {
		this.mhpId = mhpId;
		this.mhpEventId = mhpEventId;
		this.mhpPoint = mhpPoint;
		this.mhpDate = mhpDate;
		this.mhpStatus = mhpStatus;
	}

	// Property accessors

	public Integer getMhpId() {
		return this.mhpId;
	}

	public void setMhpId(Integer mhpId) {
		this.mhpId = mhpId;
	}

	public Integer getMhpEventId() {
		return this.mhpEventId;
	}

	public void setMhpEventId(Integer mhpEventId) {
		this.mhpEventId = mhpEventId;
	}

	public Integer getMhpPoint() {
		return this.mhpPoint;
	}

	public void setMhpPoint(Integer mhpPoint) {
		this.mhpPoint = mhpPoint;
	}

	public Timestamp getMhpDate() {
		return this.mhpDate;
	}

	public void setMhpDate(Timestamp mhpDate) {
		this.mhpDate = mhpDate;
	}

	public Boolean getMhpStatus() {
		return this.mhpStatus;
	}

	public void setMhpStatus(Boolean mhpStatus) {
		this.mhpStatus = mhpStatus;
	}

}