package com.cms.entity.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseCart<M extends BaseCart<M>> extends Model<M> implements IBean {

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

	public M setCartKey(java.lang.String cartKey) {
		set("cartKey", cartKey);
		return (M)this;
	}
	
	public java.lang.String getCartKey() {
		return getStr("cartKey");
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
}
