package com.atos.java.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.atos.java.bean.User;
import com.atos.java.bo.UserBO;
import com.atos.java.exceptions.UserBusinessException;
import com.atos.java.exceptions.UserException;

/**
 * Servlet implementation class UserController
 */
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		try{
			
			User user=new User();
			user.setName(request.getParameter("name").toString());
			try{
				user.setId(Integer.parseInt(request.getParameter("id")));
			}
			catch(NumberFormatException e)
			{
				throw new UserBusinessException("ID should be a number");
			}
			
			UserBO uBo=new UserBO();
			
			if(uBo.registerUser(user))
			{
				RequestDispatcher dispatcher=request.getRequestDispatcher("success.jsp");
				dispatcher.forward(request, response);
			}
		}
		catch(UserBusinessException e)
		{
			String message=e.getMessage();
			request.setAttribute("message", message);
			RequestDispatcher dispatcher=request.getRequestDispatcher("DataStore.jsp");
			dispatcher.forward(request, response);
		}
		catch(UserException e)
		{
			request.setAttribute("errMessage", "Fatal Error");
			RequestDispatcher dispatcher=request.getRequestDispatcher("error.jsp");
			dispatcher.forward(request, response);
		}
	}

}
