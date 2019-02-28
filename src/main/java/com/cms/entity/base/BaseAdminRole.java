package com.cms.entity.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseAdminRole<M extends BaseAdminRole<M>> extends Model<M> implements IBean {

	public M setAdminId(java.lang.Long adminId) {
		set("adminId", adminId);
		return (M)this;
	}
	
	public java.lang.Long getAdminId() {
		return getLong("adminId");
	}

	public M setRoleId(java.lang.Long roleId) {
		set("roleId", roleId);
		return (M)this;
	}
	
	public java.lang.Long getRoleId() {
		return getLong("roleId");
	}
}
