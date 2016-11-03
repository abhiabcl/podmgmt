package com.av.podmgmt.dao.entity;

import javax.persistence.*;

@Entity
@Table (name = "")
public class Product {
	
	@Id
	@GeneratedValue
	@Column (name = "id")
	private int mID;
	
	@Column (name = "productID")
	private String mProductID;
	
	@Column (name ="catlogID")
	private String mCatlogID;
	
	@Column (name = "productName")
	private String mProductName;
	
	@Column (name ="productMrfDate")
	private String mProductMrfDate;
	
	@Column (name ="productExpDate")
	private String mProductExpDate;
	
	@Column (name ="productBatchNumber")
	private String mProductBatchNumber;
	
	@Column (name ="productPrice")
	private String mProductPrice;
	
	@Column (name = "productQty")
	private int mProductQty;
	
	public int getmID() {
		return mID;
	}
	public void setmID(int mID) {
		this.mID = mID;
	}
	public String getmProductID() {
		return mProductID;
	}
	public void setmProductID(String mProductID) {
		this.mProductID = mProductID;
	}
	public String getmCatlogID() {
		return mCatlogID;
	}
	public void setmCatlogID(String mCatlogID) {
		this.mCatlogID = mCatlogID;
	}
	public String getmProductName() {
		return mProductName;
	}
	public void setmProductName(String mProductName) {
		this.mProductName = mProductName;
	}
	public String getmProductMrfDate() {
		return mProductMrfDate;
	}
	public void setmProductMrfDate(String mProductMrfDate) {
		this.mProductMrfDate = mProductMrfDate;
	}
	public String getmProductExpDate() {
		return mProductExpDate;
	}
	public void setmProductExpDate(String mProductExpDate) {
		this.mProductExpDate = mProductExpDate;
	}
	
	public String getmProductPrice() {
		return mProductPrice;
	}
	public void setmProductPrice(String mProductPrice) {
		this.mProductPrice = mProductPrice;
	}
	
	public int getmProductQty() {
		return mProductQty;
	}
	public void setmProductQty(int mProductQty) {
		this.mProductQty = mProductQty;
	}
	public Product(){
		
	}
	
	public Product ( String pPodId, String pCatId, String pPodName, String pPodMrfData, String pPodExpDate, String pPodBatchNo, String pPodPrice, int pPodQty){
		this.mProductID = pPodId;
		this.mCatlogID = pCatId;
		this.mProductName = pPodName;
		this.mProductMrfDate = pPodMrfData;
		this.mProductExpDate = pPodExpDate;
		this.mProductBatchNumber = pPodBatchNo;
		this.mProductQty = pPodQty;
	}
	
	public String getmProductBatchNumber() {
		return mProductBatchNumber;
	}
	
	public void setmProductBatchNumber(String mProductBatchNumber) {
		this.mProductBatchNumber = mProductBatchNumber;
	}
	
}
