package com.av.podmgmt.dao.entity;

import javax.persistence.*;

@Entity
@Table (name = "customerreference")
public class CustomerReference {

	@Id
	@GeneratedValue
	@Column (name = "id")
	private int mID;
	
	@Column (name = "customerID")
	private String mCustomerID;
	
	@Column (name="customerName")
	private String mCustomerName;
	
	@Column (name="customerAddress")
	private String mCustomerAddress;
	
	@Column (name="customerMobile")
	private String mCustomerMobile;
	
	@Column (name="customerEmail")
	private String mCustomerEmail;
	
	@Column (name="customerCity")
	private String mCustomerCity;
	
	@Column (name="customerState")
	private String mCustomerState;
	
	@Column (name="customerCountry")
	private String mCustomerCountry;
	
	public int getmID() {
		return mID;
	}
	public void setmID(int mID) {
		this.mID = mID;
	}
	public String getmCustomerID() {
		return mCustomerID;
	}
	public void setmCustomerID(String mCustomerID) {
		this.mCustomerID = mCustomerID;
	}
	public String getmCustomerName() {
		return mCustomerName;
	}
	public void setmCustomerName(String mCustomerNAme) {
		this.mCustomerName = mCustomerNAme;
	}
	public String getmCustomerAddress() {
		return mCustomerAddress;
	}
	public void setmCustomerAddress(String mCustomerAddress) {
		this.mCustomerAddress = mCustomerAddress;
	}
	public String getmCustomerMobile() {
		return mCustomerMobile;
	}
	public void setmCustomerMobile(String mCustomerMobile) {
		this.mCustomerMobile = mCustomerMobile;
	}
	public String getmCustomerEmail() {
		return mCustomerEmail;
	}
	public void setmCustomerEmail(String mCustomerEmail) {
		this.mCustomerEmail = mCustomerEmail;
	}
	public String getmCustomerCity() {
		return mCustomerCity;
	}
	public void setmCustomerCity(String mCustomerCity) {
		this.mCustomerCity = mCustomerCity;
	}
	public String getmCustomerState() {
		return mCustomerState;
	}
	public void setmCustomerState(String mCustomerState) {
		this.mCustomerState = mCustomerState;
	}
	public String getmCustomerCountry() {
		return mCustomerCountry;
	}
	public void setmCustomerCountry(String mCustomerCountry) {
		this.mCustomerCountry = mCustomerCountry;
	}
	
	
	public CustomerReference(String pId, String pName, String pAddress, String pMobile, String pEmail, String pCity, String pState, String pCountry){
		this.mCustomerID = pId;
		this.mCustomerName = pName;
		this.mCustomerAddress = pAddress;
		this.mCustomerMobile = pMobile;
		this.mCustomerEmail = pEmail;
		this.mCustomerCity = pCity;
		this.mCustomerState = pState;
		this.mCustomerCountry = pCountry;
	}
	
	
	public CustomerReference(){
		
	}
	
	
}
