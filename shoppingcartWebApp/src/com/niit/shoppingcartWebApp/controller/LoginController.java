package com.niit.shoppingcartWebApp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.niit.shoppingcartWebApp.dao.LoginDAO;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public LoginController() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("do Get");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("do Post");
		//String userId=request.getParameter("ui");
		String password=request.getParameter("password");
		String name=request.getParameter("name");
		//System.out.println(userId);
		System.out.println(password);
		System.out.println(name);
		System.out.println("heloo......................");
		LoginDAO loginDAO=new LoginDAO();
		RequestDispatcher dispatcher;
		if(loginDAO.isValidUser(name,password)==true)
		{
			dispatcher=request.getRequestDispatcher("Home.html");
			dispatcher.forward(request, response);
		}
		else
		{
			dispatcher=request.getRequestDispatcher("Login.html");
			PrintWriter writer=response.getWriter();
			writer.append("invalid creditinls please try again");
			dispatcher.include(request, response);
		}
		
		
	}

}
