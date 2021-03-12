package com.amaker.servlet;
//此类可以对页面定时刷新
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class TestRefreshServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public TestRefreshServlet() {
        super();
    }

	
	public void init(ServletConfig config) throws ServletException {
	}

	public void destroy() {
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		response.setHeader("refresh", "1");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("   <head><title>A Servlet</title></head>");
		out.println("   <body>");
		out.println(new Date().toLocaleString());
		out.println("</body>");
		out.println("</html>");
		out.flush();
		out.close();
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
