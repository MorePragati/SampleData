package com.onlineshopping;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		pw.print("<!DOCTYPE html>");
		pw.print("<html>");
		pw.print("<body>");
		pw.println("<h1>this is second servlet</h1>");
		pw.print("</body>");
		pw.print("</html>");
		
		
		
		
		
		
		
		
		
		
		
		

	/*	ServletContext sc= getServletContext();
  	    
	  	  String s1=  sc.getInitParameter("appname");
		    pw.print("context parameter= "+s1);
		    
	}*/

	}
}
