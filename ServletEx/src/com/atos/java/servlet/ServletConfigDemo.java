package com.atos.java.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletConfigDemo
 */
public class ServletConfigDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletConfigDemo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		ServletConfig  sc=getServletConfig();
		
		out.println("<h1>Printing init parameter values</h1><br>");
		out.println(sc.getInitParameter("name")+"<br>");
		out.println(sc.getInitParameter("email")+"<br>");
		
		
		out.println("<h1>Printing init parameters</h1>");
		
		Enumeration<String> en=sc.getInitParameterNames();
		
		while(en.hasMoreElements())
		{
			out.println(en.nextElement());
		}
		
		out.println("<h1>Printing Names of Servlet</h1>");
		out.println(sc.getServletName());
		
		out.println(getServletContext().getInitParameter("protocol")+"<br>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
