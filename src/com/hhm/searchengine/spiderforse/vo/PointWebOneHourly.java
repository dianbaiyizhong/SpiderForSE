package com.hhm.searchengine.spiderforse.vo;

import java.sql.Timestamp;

/**
 * PointWebOneHourly entity. @author MyEclipse Persistence Tools
 */

public class PointWebOneHourly implements java.io.Serializable {

	// Fields

	private Integer pohId;
	private Integer pohEventId;
	private Integer pohPoint;
	private Timestamp pohDate;
	private Boolean pohStatus;

	// Constructors

	/** default constructor */
	public PointWebOneHourly() {
	}

	/** full constructor */
	public PointWebOneHourly(Integer pohId, Integer pohEventId,
			Integer pohPoint, Timestamp pohDate, Boolean pohStatus) {
		this.pohId = pohId;
		this.pohEventId = pohEventId;
		this.pohPoint = pohPoint;
		this.pohDate = pohDate;
		this.pohStatus = pohStatus;
	}

	// Property accessors

	public Integer getPohId() {
		return this.pohId;
	}

	public void setPohId(Integer pohId) {
		this.pohId = pohId;
	}

	public Integer getPohEventId() {
		return this.pohEventId;
	}

	public void setPohEventId(Integer pohEventId) {
		this.pohEventId = pohEventId;
	}

	public Integer getPohPoint() {
		return this.pohPoint;
	}

	public void setPohPoint(Integer pohPoint) {
		this.pohPoint = pohPoint;
	}

	public Timestamp getPohDate() {
		return this.pohDate;
	}

	public void setPohDate(Timestamp pohDate) {
		this.pohDate = pohDate;
	}

	public Boolean getPohStatus() {
		return this.pohStatus;
	}

	public void setPohStatus(Boolean pohStatus) {
		this.pohStatus = pohStatus;
	}

}