package com.cms.entity.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseProduct<M extends BaseProduct<M>> extends Model<M> implements IBean {

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

	public M setCaption(java.lang.String caption) {
		set("caption", caption);
		return (M)this;
	}
	
	public java.lang.String getCaption() {
		return getStr("caption");
	}

	public M setImage(java.lang.String image) {
		set("image", image);
		return (M)this;
	}
	
	public java.lang.String getImage() {
		return getStr("image");
	}

	public M setIntroduction(java.lang.String introduction) {
		set("introduction", introduction);
		return (M)this;
	}
	
	public java.lang.String getIntroduction() {
		return getStr("introduction");
	}

	public M setHits(java.lang.Long hits) {
		set("hits", hits);
		return (M)this;
	}
	
	public java.lang.Long getHits() {
		return getLong("hits");
	}

	public M setProductCategoryId(java.lang.Long productCategoryId) {
		set("productCategoryId", productCategoryId);
		return (M)this;
	}
	
	public java.lang.Long getProductCategoryId() {
		return getLong("productCategoryId");
	}

	public M setParameterValue(java.lang.String parameterValue) {
		set("parameterValue", parameterValue);
		return (M)this;
	}
	
	public java.lang.String getParameterValue() {
		return getStr("parameterValue");
	}

	public M setSpecifications(java.lang.String specifications) {
		set("specifications", specifications);
		return (M)this;
	}
	
	public java.lang.String getSpecifications() {
		return getStr("specifications");
	}

	public M setMemo(java.lang.String memo) {
		set("memo", memo);
		return (M)this;
	}
	
	public java.lang.String getMemo() {
		return getStr("memo");
	}

	public M setSn(java.lang.String sn) {
		set("sn", sn);
		return (M)this;
	}
	
	public java.lang.String getSn() {
		return getStr("sn");
	}

	public M setWeight(java.lang.String weight) {
		set("weight", weight);
		return (M)this;
	}
	
	public java.lang.String getWeight() {
		return getStr("weight");
	}

	public M setProduction(java.lang.String production) {
		set("production", production);
		return (M)this;
	}
	
	public java.lang.String getProduction() {
		return getStr("production");
	}

	public M setSales(java.lang.Long sales) {
		set("sales", sales);
		return (M)this;
	}
	
	public java.lang.Long getSales() {
		return getLong("sales");
	}

	public M setIsMarketable(java.lang.Boolean isMarketable) {
		set("isMarketable", isMarketable);
		return (M)this;
	}
	
	public java.lang.Boolean getIsMarketable() {
		return get("isMarketable");
	}

	public M setUnit(java.lang.String unit) {
		set("unit", unit);
		return (M)this;
	}
	
	public java.lang.String getUnit() {
		return getStr("unit");
	}

	public M setPrice(java.math.BigDecimal price) {
		set("price", price);
		return (M)this;
	}
	
	public java.math.BigDecimal getPrice() {
		return get("price");
	}

	public M setCost(java.math.BigDecimal cost) {
		set("cost", cost);
		return (M)this;
	}
	
	public java.math.BigDecimal getCost() {
		return get("cost");
	}

	public M setMarketPrice(java.math.BigDecimal marketPrice) {
		set("marketPrice", marketPrice);
		return (M)this;
	}
	
	public java.math.BigDecimal getMarketPrice() {
		return get("marketPrice");
	}

	public M setProductImage(java.lang.String productImage) {
		set("productImage", productImage);
		return (M)this;
	}
	
	public java.lang.String getProductImage() {
		return getStr("productImage");
	}
}
