package com.atos.java.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Bill
 */
public class Bill extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String DB_URL="jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USER_ID="hr";
	private static final String PASSWORD="hr";
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Bill() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter pw=response.getWriter();
		int billno=Integer.parseInt(request.getParameter("billno"));
		String name=request.getParameter("name");
		int amount=Integer.parseInt(request.getParameter("amount"));
		
		
		//Scanner sc=new Scanner(System.in);
		
		
		Connection conn=null;
		String sql="select count(*) from bill_master";
		
		try {
			
			
			Class.forName("oracle.jdbc.OracleDriver");
			conn=DriverManager.getConnection(DB_URL,USER_ID,PASSWORD);
			
			
			
			sql="Insert into bill_master(billno,customer_name,amount) values(?,?,?)";
			PreparedStatement pst=conn.prepareStatement(sql);
			
			pst.setInt(1, billno);
			pst.setString(2, name);			
			pst.setInt(3, amount);
			
			int insertCount=pst.executeUpdate();
			
			pw.println("<h3>"+insertCount+" rows inserted</h3>");
			
			sql="Select * from bill_master";
			
			Statement st1=conn.createStatement();
			ResultSet result=st1.executeQuery(sql);
			
			pw.println("<h2>Bill Master Data</h2><table border='1' style='padding:10px;'>");
			while(result.next())
			{
				pw.println("<tr style='padding:5px;'><td style='padding:5px;'>"+result.getInt("BILLNO")+"</td><td style='padding:5px;'>"+result.getString("CUSTOMER_NAME")+"</td><td style='padding:5px;'>"+result.getInt("AMOUNT")+"</td></tr>");
			}
			pw.println("</table>");
			
			

			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
