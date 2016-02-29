package com.hhm.searchengine.spiderforse.vo;

/**
 * ConfigWarningLine entity. @author MyEclipse Persistence Tools
 */

public class ConfigWarningLine implements java.io.Serializable {

	// Fields

	private Integer wnlId;
	private String wnlName;
	private Integer wnlPoint;
	private String wnlComment;
	private Boolean wnlStatus;
	private Integer wnlOrder;

	// Constructors

	/** default constructor */
	public ConfigWarningLine() {
	}

	/** minimal constructor */
	public ConfigWarningLine(Integer wnlId, String wnlName, Integer wnlPoint,
			Boolean wnlStatus, Integer wnlOrder) {
		this.wnlId = wnlId;
		this.wnlName = wnlName;
		this.wnlPoint = wnlPoint;
		this.wnlStatus = wnlStatus;
		this.wnlOrder = wnlOrder;
	}

	/** full constructor */
	public ConfigWarningLine(Integer wnlId, String wnlName, Integer wnlPoint,
			String wnlComment, Boolean wnlStatus, Integer wnlOrder) {
		this.wnlId = wnlId;
		this.wnlName = wnlName;
		this.wnlPoint = wnlPoint;
		this.wnlComment = wnlComment;
		this.wnlStatus = wnlStatus;
		this.wnlOrder = wnlOrder;
	}

	// Property accessors

	public Integer getWnlId() {
		return this.wnlId;
	}

	public void setWnlId(Integer wnlId) {
		this.wnlId = wnlId;
	}

	public String getWnlName() {
		return this.wnlName;
	}

	public void setWnlName(String wnlName) {
		this.wnlName = wnlName;
	}

	public Integer getWnlPoint() {
		return this.wnlPoint;
	}

	public void setWnlPoint(Integer wnlPoint) {
		this.wnlPoint = wnlPoint;
	}

	public String getWnlComment() {
		return this.wnlComment;
	}

	public void setWnlComment(String wnlComment) {
		this.wnlComment = wnlComment;
	}

	public Boolean getWnlStatus() {
		return this.wnlStatus;
	}

	public void setWnlStatus(Boolean wnlStatus) {
		this.wnlStatus = wnlStatus;
	}

	public Integer getWnlOrder() {
		return this.wnlOrder;
	}

	public void setWnlOrder(Integer wnlOrder) {
		this.wnlOrder = wnlOrder;
	}

}