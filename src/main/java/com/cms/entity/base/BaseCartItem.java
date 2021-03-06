package com.cms.entity.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseCartItem<M extends BaseCartItem<M>> extends Model<M> implements IBean {

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

	public M setCartId(java.lang.Long cartId) {
		set("cartId", cartId);
		return (M)this;
	}
	
	public java.lang.Long getCartId() {
		return getLong("cartId");
	}

	public M setProductId(java.lang.Long productId) {
		set("productId", productId);
		return (M)this;
	}
	
	public java.lang.Long getProductId() {
		return getLong("productId");
	}

	public M setQuantity(java.lang.Integer quantity) {
		set("quantity", quantity);
		return (M)this;
	}
	
	public java.lang.Integer getQuantity() {
		return getInt("quantity");
	}
}
