package com.av.podmgmt.dao.entity;

import javax.persistence.*;

@Entity
@Table (name = "catalog")
public class Catalog {
	
	@Id
	@GeneratedValue
	@Column (name = "id")
	private int mID;

	@Column (name="catalogName")
	private String mCatalogName;
	
	public int getmID() {
		return mID;
	}
	public void setmID(int mID) {
		this.mID = mID;
	}
	
	public String getmCatalogName() {
		return mCatalogName;
	}
	public void setmCatalogName(String mCatalogName) {
		this.mCatalogName = mCatalogName;
	}
	
	public Catalog(){
		
	}
	
//	public Catalog ( String pName){
//		this.mCatalogName = pName;
//	}

}
