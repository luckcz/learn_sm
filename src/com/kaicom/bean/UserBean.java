package com.kaicom.bean;

public class UserBean {
	private Integer id ;
	private String userNo ;
	private String userName ;
	private String loginName ;
	private String password ;
	private String deptNo ;
	private DeptBean deptBean ;
	
	public UserBean(){}
	
	public UserBean(Integer id, String userNo, String userName, String loginName, String password, String deptNo,
			DeptBean deptBean) {
		super();
		this.id = id;
		this.userNo = userNo;
		this.userName = userName;
		this.loginName = loginName;
		this.password = password;
		this.deptNo = deptNo;
		this.deptBean = deptBean;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserNo() {
		return userNo;
	}
	public void setUserNo(String userNo) {
		this.userNo = userNo;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(String deptNo) {
		this.deptNo = deptNo;
	}
	
	public DeptBean getDeptBean() {
		return deptBean;
	}
	public void setDeptBean(DeptBean deptBean) {
		this.deptBean = deptBean;
	}
	@Override
	public String toString() {
		return "UserBean [id=" + id + ", userNo=" + userNo + ", userName=" + userName + ", loginName=" + loginName
				+ ", password=" + password + ", deptNo=" + deptNo + ", deptBean=" + deptBean + "]";
	}
	
}
