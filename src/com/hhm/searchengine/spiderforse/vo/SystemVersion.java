package com.hhm.searchengine.spiderforse.vo;

/**
 * SystemVersion entity. @author MyEclipse Persistence Tools
 */

public class SystemVersion implements java.io.Serializable {

	// Fields

	private Integer verId;
	private String verName;
	private Boolean verStatus;
	private String verComment;

	// Constructors

	/** default constructor */
	public SystemVersion() {
	}

	/** minimal constructor */
	public SystemVersion(Integer verId, String verName, Boolean verStatus) {
		this.verId = verId;
		this.verName = verName;
		this.verStatus = verStatus;
	}

	/** full constructor */
	public SystemVersion(Integer verId, String verName, Boolean verStatus,
			String verComment) {
		this.verId = verId;
		this.verName = verName;
		this.verStatus = verStatus;
		this.verComment = verComment;
	}

	// Property accessors

	public Integer getVerId() {
		return this.verId;
	}

	public void setVerId(Integer verId) {
		this.verId = verId;
	}

	public String getVerName() {
		return this.verName;
	}

	public void setVerName(String verName) {
		this.verName = verName;
	}

	public Boolean getVerStatus() {
		return this.verStatus;
	}

	public void setVerStatus(Boolean verStatus) {
		this.verStatus = verStatus;
	}

	public String getVerComment() {
		return this.verComment;
	}

	public void setVerComment(String verComment) {
		this.verComment = verComment;
	}

}