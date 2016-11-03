package com.av.podmgmt.dao.entity;

import javax.persistence.*;

@Entity
@Table (name ="purchaseorder")
public class PurchaseOrder {
	
	@Id
	@GeneratedValue
	@Column (name = "ID")
	private int mID;
	
	@Column (name = "purchaseID")
	private String mPurchaseID;
	
	@Column (name = "productID")
	private String mProductID;
	
	@Column (name = "customerID")
	private String mCustomerID;
	
	@Column (name = "productQty")
	private int mProductyQty;

	@Column (name = "totalPrice")
	private int mTotalPrice;
	
	@Column (name = "paymentMode")
	private String mPaymentMode;
	
	@Column (name = "paymentStatus")
	private String mPaymentStatus;
	
	public int getmID() {
		return mID;
	}
	public void setmID(int mID) {
		this.mID = mID;
	}
	public String getmPurchaseID() {
		return mPurchaseID;
	}
	public void setmPurchaseID(String mPurchaseID) {
		this.mPurchaseID = mPurchaseID;
	}
	public String getmProductID() {
		return mProductID;
	}
	public void setmProductID(String mProductID) {
		this.mProductID = mProductID;
	}
	public String getmCustomerID() {
		return mCustomerID;
	}
	public void setmCustomerID(String mCustomerID) {
		this.mCustomerID = mCustomerID;
	}
	public int getmProductyQty() {
		return mProductyQty;
	}
	public void setmProductyQty(int mProductyQty) {
		this.mProductyQty = mProductyQty;
	}
	public int getmTotalPrice() {
		return mTotalPrice;
	}
	public void setmTotalPrice(int mTotalPrice) {
		this.mTotalPrice = mTotalPrice;
	}
	public String getmPaymentMode() {
		return mPaymentMode;
	}
	public void setmPaymentMode(String mPaymentMode) {
		this.mPaymentMode = mPaymentMode;
	}
	public String getmPaymentStatus() {
		return mPaymentStatus;
	}
	public void setmPaymentStatus(String mPaymentStatus) {
		this.mPaymentStatus = mPaymentStatus;
	}
	
	public PurchaseOrder(){
		
	}
//	
//	public PurchaseOrder(String pPurId, String pPodId, String pCustId, int pPodQty, int pTotal, String pPayMode, String pPayStatus){
//		this.mPurchaseID = pPurId;
//		this.mProductID = pPodId;
//		this.mCustomerID = pCustId;
//		this.mProductyQty = pPodQty;
//		this.mTotalPrice = pTotal;
//		this.mPaymentStatus = pPayStatus;
//		this.mPaymentMode = pPayMode;
//	}
}
