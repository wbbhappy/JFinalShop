package com.cms.entity.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseReceiver<M extends BaseReceiver<M>> extends Model<M> implements IBean {

	public M setId(java.lang.Long id) {
		set("id", id);
		return (M)this;
	}
	
	public java.lang.Long getId() {
		return getLong("id");
	}

	public M setCreateDate(java.util.Date createDate) {
		set("createDate", createDate);
		return (M)this;
	}
	
	public java.util.Date getCreateDate() {
		return get("createDate");
	}

	public M setModifyDate(java.util.Date modifyDate) {
		set("modifyDate", modifyDate);
		return (M)this;
	}
	
	public java.util.Date getModifyDate() {
		return get("modifyDate");
	}

	public M setAddress(java.lang.String address) {
		set("address", address);
		return (M)this;
	}
	
	public java.lang.String getAddress() {
		return getStr("address");
	}

	public M setMemberId(java.lang.Long memberId) {
		set("memberId", memberId);
		return (M)this;
	}
	
	public java.lang.Long getMemberId() {
		return getLong("memberId");
	}

	public M setAreaName(java.lang.String areaName) {
		set("areaName", areaName);
		return (M)this;
	}
	
	public java.lang.String getAreaName() {
		return getStr("areaName");
	}

	public M setConsignee(java.lang.String consignee) {
		set("consignee", consignee);
		return (M)this;
	}
	
	public java.lang.String getConsignee() {
		return getStr("consignee");
	}

	public M setPhone(java.lang.String phone) {
		set("phone", phone);
		return (M)this;
	}
	
	public java.lang.String getPhone() {
		return getStr("phone");
	}

	public M setZipCode(java.lang.String zipCode) {
		set("zipCode", zipCode);
		return (M)this;
	}
	
	public java.lang.String getZipCode() {
		return getStr("zipCode");
	}

	public M setAreaId(java.lang.Long areaId) {
		set("areaId", areaId);
		return (M)this;
	}
	
	public java.lang.Long getAreaId() {
		return getLong("areaId");
	}

	public M setIsDefault(java.lang.Boolean isDefault) {
		set("isDefault", isDefault);
		return (M)this;
	}
	
	public java.lang.Boolean getIsDefault() {
		return get("isDefault");
	}
}
