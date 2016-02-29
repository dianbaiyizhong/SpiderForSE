package com.hhm.searchengine.spiderforse.vo;

import java.sql.Timestamp;

/**
 * PointWebOneDaily entity. @author MyEclipse Persistence Tools
 */

public class PointWebOneDaily implements java.io.Serializable {

	// Fields

	private Integer podId;
	private Integer podEventId;
	private Integer podPoint;
	private Timestamp podDate;
	private Boolean podStatus;

	// Constructors

	/** default constructor */
	public PointWebOneDaily() {
	}

	/** full constructor */
	public PointWebOneDaily(Integer podId, Integer podEventId,
			Integer podPoint, Timestamp podDate, Boolean podStatus) {
		this.podId = podId;
		this.podEventId = podEventId;
		this.podPoint = podPoint;
		this.podDate = podDate;
		this.podStatus = podStatus;
	}

	// Property accessors

	public Integer getPodId() {
		return this.podId;
	}

	public void setPodId(Integer podId) {
		this.podId = podId;
	}

	public Integer getPodEventId() {
		return this.podEventId;
	}

	public void setPodEventId(Integer podEventId) {
		this.podEventId = podEventId;
	}

	public Integer getPodPoint() {
		return this.podPoint;
	}

	public void setPodPoint(Integer podPoint) {
		this.podPoint = podPoint;
	}

	public Timestamp getPodDate() {
		return this.podDate;
	}

	public void setPodDate(Timestamp podDate) {
		this.podDate = podDate;
	}

	public Boolean getPodStatus() {
		return this.podStatus;
	}

	public void setPodStatus(Boolean podStatus) {
		this.podStatus = podStatus;
	}

}