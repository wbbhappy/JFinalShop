package com.cms.entity.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseMember<M extends BaseMember<M>> extends Model<M> implements IBean {

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

	public M setPassword(java.lang.String password) {
		set("password", password);
		return (M)this;
	}
	
	public java.lang.String getPassword() {
		return getStr("password");
	}

	public M setLoginDate(java.util.Date loginDate) {
		set("loginDate", loginDate);
		return (M)this;
	}
	
	public java.util.Date getLoginDate() {
		return get("loginDate");
	}

	public M setLoginIp(java.lang.String loginIp) {
		set("loginIp", loginIp);
		return (M)this;
	}
	
	public java.lang.String getLoginIp() {
		return getStr("loginIp");
	}

	public M setUsername(java.lang.String username) {
		set("username", username);
		return (M)this;
	}
	
	public java.lang.String getUsername() {
		return getStr("username");
	}

	public M setBirth(java.util.Date birth) {
		set("birth", birth);
		return (M)this;
	}
	
	public java.util.Date getBirth() {
		return get("birth");
	}

	public M setEmail(java.lang.String email) {
		set("email", email);
		return (M)this;
	}
	
	public java.lang.String getEmail() {
		return getStr("email");
	}

	public M setMobile(java.lang.String mobile) {
		set("mobile", mobile);
		return (M)this;
	}
	
	public java.lang.String getMobile() {
		return getStr("mobile");
	}

	public M setRegisterIp(java.lang.String registerIp) {
		set("registerIp", registerIp);
		return (M)this;
	}
	
	public java.lang.String getRegisterIp() {
		return getStr("registerIp");
	}

	public M setBalance(java.math.BigDecimal balance) {
		set("balance", balance);
		return (M)this;
	}
	
	public java.math.BigDecimal getBalance() {
		return get("balance");
	}

	public M setAmount(java.math.BigDecimal amount) {
		set("amount", amount);
		return (M)this;
	}
	
	public java.math.BigDecimal getAmount() {
		return get("amount");
	}

	public M setWeixinOpenId(java.lang.String weixinOpenId) {
		set("weixinOpenId", weixinOpenId);
		return (M)this;
	}
	
	public java.lang.String getWeixinOpenId() {
		return getStr("weixinOpenId");
	}
}
