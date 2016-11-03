package com.av.podmgmt.dao.entity;

import javax.persistence.*;

@Entity
@Table (name = "podmgmtuser")
public class PodmgmtUser {
	
	@Id
	@GeneratedValue
	@Column (name = "id")
	private int mID;
	
	@Column (name ="userid")
	private String mUserid;
	
	@Column (name ="password")
	private String mPassword;
	
	@Column (name ="lastlogin")
	private String mLastlogin;
	
	@Column (name ="mobileno")
	private String mMobileNo;
	
	@Column (name="email")
	private String mEmail;
	
	@Column (name="role")
	private String mRole;
	
	@Column (name="city")
	private String mCity;
	
	
	public String getmCity() {
		return mCity;
	}
	public void setmCity(String mCity) {
		this.mCity = mCity;
	}
	public String getmRole() {
		return mRole;
	}
	public void setmRole(String mRole) {
		this.mRole = mRole;
	}
	public int getmID() {
		return mID;
	}
	public void setmID(int mID) {
		this.mID = mID;
	}
	public String getmUserid() {
		return mUserid;
	}
	public void setmUserid(String mUserid) {
		this.mUserid = mUserid;
	}
	public String getmPassword() {
		return mPassword;
	}
	public void setmPassword(String mPasswrod) {
		this.mPassword = mPasswrod;
	}
	public String getmLastlogin() {
		return mLastlogin;
	}
	public void setmLastlogin(String mLastlogin) {
		this.mLastlogin = mLastlogin;
	}
	public String getmMobileNo() {
		return mMobileNo;
	}
	public void setmMobileNo(String mMobileNo) {
		this.mMobileNo = mMobileNo;
	}
	public String getmEmail() {
		return mEmail;
	}
	public void setmEmail(String mEmail) {
		this.mEmail = mEmail;
	}
	
	public PodmgmtUser(){
		
	}
	
	public PodmgmtUser(String pUserid, String pPassword, String pLastlogin, String pMobileNo, String pEmail, String pRole){
		this.mUserid = pUserid;
		this.mPassword = pPassword;
		this.mLastlogin = pLastlogin;
		this.mMobileNo = pMobileNo;
		this.mEmail = pEmail;
		this.mRole = pRole;
	}
	
	
}
