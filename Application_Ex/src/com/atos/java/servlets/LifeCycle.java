package com.atos.java.servlets;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LifeCycle
 */
@WebServlet("/LifeCycle")
public class LifeCycle extends HttpServlet {
	private static final long serialVersionUID = 1L;
     private ServletConfig config;
     private StringBuffer sb;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LifeCycle() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		sb=new StringBuffer();
		sb.append("Attending Induction Program . . . >");
		this.config=config;
		show();
	}
	
	public void show()
	{
		sb.append("Id is Created and Started E-learning sessions ->");
				
	}
	
	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
	{
		sb.append("Technical Session started ->");
		doGet(req,res);
		
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		
		System.out.println("Destroyed . . ");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		sb.append("Wrote Module tests and Cleared and into BU");
	response.setContentType("text/html");
	response.getWriter().println("<html><body>"
			+ "<h1>"+sb.toString()+"</h1>"
			+ "</body></html>");
	
	sb.delete(0,sb.length());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
