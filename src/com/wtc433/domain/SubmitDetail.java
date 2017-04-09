package com.wtc433.domain;

public class SubmitDetail extends Shop{
	
	private String name;  //用户姓名
	private String telephone;//用户电话
	private String college; //学院
	private String 	floor; //楼层	
	private String dormitory; //宿舍号 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getFloor() {
		return floor;
	}
	public void setFloor(String floor) {
		this.floor = floor;
	}
	public String getDormitory() {
		return dormitory;
	}
	public void setDormitory(String dormitory) {
		this.dormitory = dormitory;
	}
	@Override
	public String toString() {
		return "OrderExt [name=" + name + ", telephone=" + telephone + ", college=" + college + ", floor=" + floor
				+ ", dormitory=" + dormitory + "]";
	}
	
}
