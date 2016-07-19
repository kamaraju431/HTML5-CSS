package com.niit.shoppingcartWebApp.dao;



public class LoginDAO 
{
	public boolean isValidUser(String userId,String Password)
	{
	if(userId.equals(Password))
	return true;
	else
	return false;
	}
}
