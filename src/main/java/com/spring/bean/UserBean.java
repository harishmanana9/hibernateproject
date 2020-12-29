package com.spring.bean;

public class UserBean {
	private Integer userNo;
	private String userName;
	private String city;
	
	public UserBean() {
		
	}

	public UserBean(String userName, String city) {
		super();
		this.userName = userName;
		this.city = city;
	}

	public Integer getUserNo() {
		return userNo;
	}

	public void setUserNo(Integer userNo) {
		this.userNo = userNo;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "UserBean [userNo=" + userNo + ", userName=" + userName + ", city=" + city + "]";
	}
}
