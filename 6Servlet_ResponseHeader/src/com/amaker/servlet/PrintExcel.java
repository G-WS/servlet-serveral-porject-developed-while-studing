package com.amaker.servlet;
//可以通过访问http://localhost:8080/6Servlet_ResponseHeader/servlet/PrintExcel来打开excel表格
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class PrintExcel extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public PrintExcel() {
        super();
    }

	
	public void init(ServletConfig config) throws ServletException {
	}


	public void destroy() {
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	
		response.setContentType("application/vnd.ms-excel");
		PrintWriter out = response.getWriter();
		out.println("\tQ1\tQ2\tQ3\tQ4\tTotal");
		out.println("apples\t78\t87\t92\t29\t=SUM(B2:E2)");
		out.println("Orange\t77\t86\t93\t30\t=SUM(B3:E3)");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
