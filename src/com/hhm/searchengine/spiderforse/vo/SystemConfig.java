package com.hhm.searchengine.spiderforse.vo;

/**
 * SystemConfig entity. @author MyEclipse Persistence Tools
 */

public class SystemConfig implements java.io.Serializable {

	// Fields

	private Integer configId;
	private String configName;
	private String configValue;
	private String configExpress;
	private Integer configType;
	private String configCss;
	private String configComment;
	private Integer configOrder;
	private Boolean configStatus;

	// Constructors

	/** default constructor */
	public SystemConfig() {
	}

	/** minimal constructor */
	public SystemConfig(Integer configId, String configName,
			String configValue, Integer configType, Integer configOrder,
			Boolean configStatus) {
		this.configId = configId;
		this.configName = configName;
		this.configValue = configValue;
		this.configType = configType;
		this.configOrder = configOrder;
		this.configStatus = configStatus;
	}

	/** full constructor */
	public SystemConfig(Integer configId, String configName,
			String configValue, String configExpress, Integer configType,
			String configCss, String configComment, Integer configOrder,
			Boolean configStatus) {
		this.configId = configId;
		this.configName = configName;
		this.configValue = configValue;
		this.configExpress = configExpress;
		this.configType = configType;
		this.configCss = configCss;
		this.configComment = configComment;
		this.configOrder = configOrder;
		this.configStatus = configStatus;
	}

	// Property accessors

	public Integer getConfigId() {
		return this.configId;
	}

	public void setConfigId(Integer configId) {
		this.configId = configId;
	}

	public String getConfigName() {
		return this.configName;
	}

	public void setConfigName(String configName) {
		this.configName = configName;
	}

	public String getConfigValue() {
		return this.configValue;
	}

	public void setConfigValue(String configValue) {
		this.configValue = configValue;
	}

	public String getConfigExpress() {
		return this.configExpress;
	}

	public void setConfigExpress(String configExpress) {
		this.configExpress = configExpress;
	}

	public Integer getConfigType() {
		return this.configType;
	}

	public void setConfigType(Integer configType) {
		this.configType = configType;
	}

	public String getConfigCss() {
		return this.configCss;
	}

	public void setConfigCss(String configCss) {
		this.configCss = configCss;
	}

	public String getConfigComment() {
		return this.configComment;
	}

	public void setConfigComment(String configComment) {
		this.configComment = configComment;
	}

	public Integer getConfigOrder() {
		return this.configOrder;
	}

	public void setConfigOrder(Integer configOrder) {
		this.configOrder = configOrder;
	}

	public Boolean getConfigStatus() {
		return this.configStatus;
	}

	public void setConfigStatus(Boolean configStatus) {
		this.configStatus = configStatus;
	}

}