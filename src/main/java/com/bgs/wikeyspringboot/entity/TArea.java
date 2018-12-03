package com.bgs.wikeyspringboot.entity;

public class TArea {
	private String areaId;

	private String areacode;

	private String areaname;

	private Byte level;

	private String citycode;

	private String center;

	private Integer parentid;

	public void setAreaId(String areaId) {
		this.areaId = areaId;
	}

	public String getAreaId() {
		return areaId;
	}

	public String getAreacode() {
		return areacode;
	}

	public void setAreacode(String areacode) {
		this.areacode = areacode == null ? null : areacode.trim();
	}

	public String getAreaname() {
		return areaname;
	}

	public void setAreaname(String areaname) {
		this.areaname = areaname == null ? null : areaname.trim();
	}

	public Byte getLevel() {
		return level;
	}

	public void setLevel(Byte level) {
		this.level = level;
	}

	public String getCitycode() {
		return citycode;
	}

	public void setCitycode(String citycode) {
		this.citycode = citycode == null ? null : citycode.trim();
	}

	public String getCenter() {
		return center;
	}

	public void setCenter(String center) {
		this.center = center == null ? null : center.trim();
	}

	public Integer getParentid() {
		return parentid;
	}

	public void setParentid(Integer parentid) {
		this.parentid = parentid;
	}

	@Override
	public String toString() {
		return "TArea [areaId=" + areaId + ", areacode=" + areacode
				+ ", areaname=" + areaname + ", level=" + level + ", citycode="
				+ citycode + ", center=" + center + ", parentid=" + parentid
				+ "]";
	}
}