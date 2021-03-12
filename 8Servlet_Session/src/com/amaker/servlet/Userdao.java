package com.amaker.servlet;



public interface Userdao {
	//login
	public Userbean login(String username,String password);
	//register
	public void register(Userbean u);
	//check
	public boolean check(String username);
	

}
