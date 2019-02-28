package com.cms.entity.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseArea<M extends BaseArea<M>> extends Model<M> implements IBean {

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

	public M setSort(java.lang.Integer sort) {
		set("sort", sort);
		return (M)this;
	}
	
	public java.lang.Integer getSort() {
		return getInt("sort");
	}

	public M setFullName(java.lang.String fullName) {
		set("fullName", fullName);
		return (M)this;
	}
	
	public java.lang.String getFullName() {
		return getStr("fullName");
	}

	public M setGrade(java.lang.Integer grade) {
		set("grade", grade);
		return (M)this;
	}
	
	public java.lang.Integer getGrade() {
		return getInt("grade");
	}

	public M setName(java.lang.String name) {
		set("name", name);
		return (M)this;
	}
	
	public java.lang.String getName() {
		return getStr("name");
	}

	public M setTreePath(java.lang.String treePath) {
		set("treePath", treePath);
		return (M)this;
	}
	
	public java.lang.String getTreePath() {
		return getStr("treePath");
	}

	public M setParentId(java.lang.Long parentId) {
		set("parentId", parentId);
		return (M)this;
	}
	
	public java.lang.Long getParentId() {
		return getLong("parentId");
	}
}
