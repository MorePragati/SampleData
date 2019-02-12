package com.onlineshopping;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");	
	PrintWriter pw=response.getWriter();
	
	String s=request.getParameter("username");
	String p=request.getParameter("password");
	
	//System.out.println("uname="+s+"pass="+p);
	
	//pw.print("welcome  "+s+" ur password is  "+p);
	
	if(s.equals("admin")&&p.equals("admin"))
	{
	RequestDispatcher rd=
		request.getRequestDispatcher("/SecondServlet");
	rd.forward(request, response);
	}
	else
	{
		
		pw.print("Error.....");
		RequestDispatcher rd=
				request.getRequestDispatcher("index.html");
			rd.include(request, response);
			
	}
	
	
	}


}
