package com.cms.entity.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseOrderItem<M extends BaseOrderItem<M>> extends Model<M> implements IBean {

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

	public M setName(java.lang.String name) {
		set("name", name);
		return (M)this;
	}
	
	public java.lang.String getName() {
		return getStr("name");
	}

	public M setImage(java.lang.String image) {
		set("image", image);
		return (M)this;
	}
	
	public java.lang.String getImage() {
		return getStr("image");
	}

	public M setProductId(java.lang.Long productId) {
		set("productId", productId);
		return (M)this;
	}
	
	public java.lang.Long getProductId() {
		return getLong("productId");
	}

	public M setOrderId(java.lang.Long orderId) {
		set("orderId", orderId);
		return (M)this;
	}
	
	public java.lang.Long getOrderId() {
		return getLong("orderId");
	}

	public M setPrice(java.math.BigDecimal price) {
		set("price", price);
		return (M)this;
	}
	
	public java.math.BigDecimal getPrice() {
		return get("price");
	}

	public M setQuantity(java.lang.Integer quantity) {
		set("quantity", quantity);
		return (M)this;
	}
	
	public java.lang.Integer getQuantity() {
		return getInt("quantity");
	}

	public M setSn(java.lang.String sn) {
		set("sn", sn);
		return (M)this;
	}
	
	public java.lang.String getSn() {
		return getStr("sn");
	}
}
