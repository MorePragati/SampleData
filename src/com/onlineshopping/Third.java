package com.onlineshopping;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//@WebServlet("/Third")
public class Third extends HttpServlet {
	private static final long serialVersionUID = 1L;
  	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
  		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		//pw.println("this is third servlet");

  	    ServletConfig cfg= getServletConfig();
  	    String s=  cfg.getInitParameter("driver");
  	    pw.print("init parameter= "+s);
  	    
  	    
  	    
  	    ServletContext sc= getServletContext();
  	    
  	  String s1=  sc.getInitParameter("appname");
	    pw.print("\ncontext parameter= "+s1);
	    
  	    
  	    
  	    
  	}

	
}
