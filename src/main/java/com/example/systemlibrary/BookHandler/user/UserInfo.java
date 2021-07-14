package com.example.systemlibrary.BookHandler.user;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserInfo{
	
	private int uID;
	private String uName;
	private String uAddres;
	
	public int getuID() {
		return uID;
	}
	public void setuID(int uID) {
		this.uID = uID;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getuAddress() {
		return uAddres;
	}
	public void setuAddress(String uAddres) {
		this.uAddres = uAddres;
	}
	
	@RequestMapping("/id")
	public String DisplayID() {
		
		setuID(1311946);
		return "Hello " + getuID();
	}

	
	@RequestMapping("/user")
	public String DisplayName() {
		
		setuName("Lao");
		return "Hello " + getuName();
	}
	
	@RequestMapping("/address")
	public String DisplayAddress() {
		
		setuAddress("Makati");
		return "Hello " + getuAddress();
	}



}
