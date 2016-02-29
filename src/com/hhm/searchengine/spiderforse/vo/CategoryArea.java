package com.hhm.searchengine.spiderforse.vo;

/**
 * CategoryArea entity. @author MyEclipse Persistence Tools
 */

public class CategoryArea implements java.io.Serializable {

	// Fields

	private Integer cgaId;
	private String cgaName;
	private String cgaComment;
	private Boolean cgaStatus;
	private Integer cgaOrder;

	// Constructors

	/** default constructor */
	public CategoryArea() {
	}

	/** minimal constructor */
	public CategoryArea(Integer cgaId, String cgaName, Boolean cgaStatus,
			Integer cgaOrder) {
		this.cgaId = cgaId;
		this.cgaName = cgaName;
		this.cgaStatus = cgaStatus;
		this.cgaOrder = cgaOrder;
	}

	/** full constructor */
	public CategoryArea(Integer cgaId, String cgaName, String cgaComment,
			Boolean cgaStatus, Integer cgaOrder) {
		this.cgaId = cgaId;
		this.cgaName = cgaName;
		this.cgaComment = cgaComment;
		this.cgaStatus = cgaStatus;
		this.cgaOrder = cgaOrder;
	}

	// Property accessors

	public Integer getCgaId() {
		return this.cgaId;
	}

	public void setCgaId(Integer cgaId) {
		this.cgaId = cgaId;
	}

	public String getCgaName() {
		return this.cgaName;
	}

	public void setCgaName(String cgaName) {
		this.cgaName = cgaName;
	}

	public String getCgaComment() {
		return this.cgaComment;
	}

	public void setCgaComment(String cgaComment) {
		this.cgaComment = cgaComment;
	}

	public Boolean getCgaStatus() {
		return this.cgaStatus;
	}

	public void setCgaStatus(Boolean cgaStatus) {
		this.cgaStatus = cgaStatus;
	}

	public Integer getCgaOrder() {
		return this.cgaOrder;
	}

	public void setCgaOrder(Integer cgaOrder) {
		this.cgaOrder = cgaOrder;
	}

}