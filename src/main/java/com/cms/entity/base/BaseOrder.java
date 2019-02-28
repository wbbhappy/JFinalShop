package com.cms.entity.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseOrder<M extends BaseOrder<M>> extends Model<M> implements IBean {

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

	public M setExpire(java.util.Date expire) {
		set("expire", expire);
		return (M)this;
	}
	
	public java.util.Date getExpire() {
		return get("expire");
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

	public M setCompleteDate(java.util.Date completeDate) {
		set("completeDate", completeDate);
		return (M)this;
	}
	
	public java.util.Date getCompleteDate() {
		return get("completeDate");
	}

	public M setConsignee(java.lang.String consignee) {
		set("consignee", consignee);
		return (M)this;
	}
	
	public java.lang.String getConsignee() {
		return getStr("consignee");
	}

	public M setMemo(java.lang.String memo) {
		set("memo", memo);
		return (M)this;
	}
	
	public java.lang.String getMemo() {
		return getStr("memo");
	}

	public M setPhone(java.lang.String phone) {
		set("phone", phone);
		return (M)this;
	}
	
	public java.lang.String getPhone() {
		return getStr("phone");
	}

	public M setSn(java.lang.String sn) {
		set("sn", sn);
		return (M)this;
	}
	
	public java.lang.String getSn() {
		return getStr("sn");
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

	public M setStatus(java.lang.String status) {
		set("status", status);
		return (M)this;
	}
	
	public java.lang.String getStatus() {
		return getStr("status");
	}

	public M setShippingMethod(java.lang.String shippingMethod) {
		set("shippingMethod", shippingMethod);
		return (M)this;
	}
	
	public java.lang.String getShippingMethod() {
		return getStr("shippingMethod");
	}

	public M setAmount(java.math.BigDecimal amount) {
		set("amount", amount);
		return (M)this;
	}
	
	public java.math.BigDecimal getAmount() {
		return get("amount");
	}

	public M setTotalPrice(java.math.BigDecimal totalPrice) {
		set("totalPrice", totalPrice);
		return (M)this;
	}
	
	public java.math.BigDecimal getTotalPrice() {
		return get("totalPrice");
	}

	public M setQuantity(java.lang.Integer quantity) {
		set("quantity", quantity);
		return (M)this;
	}
	
	public java.lang.Integer getQuantity() {
		return getInt("quantity");
	}
}
