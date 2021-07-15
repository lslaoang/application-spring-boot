package com.example.systemlibrary.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Books {
	
	@Id
	@Column	
	private int bookid;
	
	@Column	
	private String bookName;
	
	@Column	
	private float bookPrice;
	
	@Column	
	private String bookAuthor;
	

	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookID) {
		this.bookid = bookID;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public float getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(float bookPrice) {
		this.bookPrice = bookPrice;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

}
