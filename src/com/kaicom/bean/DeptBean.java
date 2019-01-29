package com.kaicom.bean;

import java.util.List;

public class DeptBean {
	private Integer id ;
	private String deptNo ;
	private String deptName ;
	private String deptMainManager ;
	private String phone ;
	private String oDate ;
	private List<UserBean> list ;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(String deptNo) {
		this.deptNo = deptNo;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getDeptMainManager() {
		return deptMainManager;
	}
	public void setDeptMainManager(String deptMainManager) {
		this.deptMainManager = deptMainManager;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getoDate() {
		return oDate;
	}
	public void setoDate(String oDate) {
		this.oDate = oDate;
	}
	public List<UserBean> getList() {
		return list;
	}
	public void setList(List<UserBean> list) {
		this.list = list;
	}
	@Override
	public String toString() {
		return "DeptBean [id=" + id + ", deptNo=" + deptNo + ", deptName=" + deptName + ", deptMainManager="
				+ deptMainManager + ", phone=" + phone + ", oDate=" + oDate + ", list=" + list + "]";
	}
}
