package com.cms.entity.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseAdPosition<M extends BaseAdPosition<M>> extends Model<M> implements IBean {

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

	public M setDescription(java.lang.String description) {
		set("description", description);
		return (M)this;
	}
	
	public java.lang.String getDescription() {
		return getStr("description");
	}

	public M setName(java.lang.String name) {
		set("name", name);
		return (M)this;
	}
	
	public java.lang.String getName() {
		return getStr("name");
	}

	public M setTemplate(java.lang.String template) {
		set("template", template);
		return (M)this;
	}
	
	public java.lang.String getTemplate() {
		return getStr("template");
	}
}