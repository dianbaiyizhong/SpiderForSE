package com.hhm.searchengine.spiderforse.vo;

import java.sql.Timestamp;

/**
 * PointWebOneRealTime entity. @author MyEclipse Persistence Tools
 */

public class PointWebOneRealTime implements java.io.Serializable {

	// Fields

	private Integer porId;
	private Integer porEventId;
	private Integer porPoint;
	private Timestamp porDate;
	private Boolean porStatus;

	// Constructors

	/** default constructor */
	public PointWebOneRealTime() {
	}

	/** full constructor */
	public PointWebOneRealTime(Integer porId, Integer porEventId,
			Integer porPoint, Timestamp porDate, Boolean porStatus) {
		this.porId = porId;
		this.porEventId = porEventId;
		this.porPoint = porPoint;
		this.porDate = porDate;
		this.porStatus = porStatus;
	}

	// Property accessors

	public Integer getPorId() {
		return this.porId;
	}

	public void setPorId(Integer porId) {
		this.porId = porId;
	}

	public Integer getPorEventId() {
		return this.porEventId;
	}

	public void setPorEventId(Integer porEventId) {
		this.porEventId = porEventId;
	}

	public Integer getPorPoint() {
		return this.porPoint;
	}

	public void setPorPoint(Integer porPoint) {
		this.porPoint = porPoint;
	}

	public Timestamp getPorDate() {
		return this.porDate;
	}

	public void setPorDate(Timestamp porDate) {
		this.porDate = porDate;
	}

	public Boolean getPorStatus() {
		return this.porStatus;
	}

	public void setPorStatus(Boolean porStatus) {
		this.porStatus = porStatus;
	}

}