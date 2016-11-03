package com.av.podmgmt.dao.entity;

import javax.persistence.*;

@Entity
@Table (name ="inventroy")
public class Inventroy {

	@Id
	@GeneratedValue
	@Column (name = "id")
	private int mID;
	
	@Column (name="productID")
	private String mProductID;  
	
	@Column (name="productQty")
	private int mProducyQty;
	
	
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
	public int getmProducyQty() {
		return mProducyQty;
	}
	public void setmProducyQty(int mProducyQty) {
		this.mProducyQty = mProducyQty;
	}
	
	public Inventroy(){
		
	}
	
	public Inventroy(String pId, int pQty){
		this.mProductID = pId;
		this.mProducyQty = pQty;
	}
		
	
	
}
