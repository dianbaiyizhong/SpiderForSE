package com.hhm.searchengine.spiderforse.vo;

/**
 * CategorySiteOne entity. @author MyEclipse Persistence Tools
 */

public class CategorySiteOne implements java.io.Serializable {

	// Fields

	private Integer csoId;
	private String csoName;
	private String csoComment;
	private Boolean csoStatus;
	private Integer csoOrder;

	// Constructors

	/** default constructor */
	public CategorySiteOne() {
	}

	/** minimal constructor */
	public CategorySiteOne(Integer csoId, String csoName, Boolean csoStatus,
			Integer csoOrder) {
		this.csoId = csoId;
		this.csoName = csoName;
		this.csoStatus = csoStatus;
		this.csoOrder = csoOrder;
	}

	/** full constructor */
	public CategorySiteOne(Integer csoId, String csoName, String csoComment,
			Boolean csoStatus, Integer csoOrder) {
		this.csoId = csoId;
		this.csoName = csoName;
		this.csoComment = csoComment;
		this.csoStatus = csoStatus;
		this.csoOrder = csoOrder;
	}

	// Property accessors

	public Integer getCsoId() {
		return this.csoId;
	}

	public void setCsoId(Integer csoId) {
		this.csoId = csoId;
	}

	public String getCsoName() {
		return this.csoName;
	}

	public void setCsoName(String csoName) {
		this.csoName = csoName;
	}

	public String getCsoComment() {
		return this.csoComment;
	}

	public void setCsoComment(String csoComment) {
		this.csoComment = csoComment;
	}

	public Boolean getCsoStatus() {
		return this.csoStatus;
	}

	public void setCsoStatus(Boolean csoStatus) {
		this.csoStatus = csoStatus;
	}

	public Integer getCsoOrder() {
		return this.csoOrder;
	}

	public void setCsoOrder(Integer csoOrder) {
		this.csoOrder = csoOrder;
	}

}