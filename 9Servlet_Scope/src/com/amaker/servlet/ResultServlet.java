package com.amaker.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class ResultServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ResultServlet() {
        super();
    }

	
	public void init(ServletConfig config) throws ServletException {
	}

	
	public void destroy() {
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String request_value = (String) request.getAttribute("request_name") ;
		HttpSession session = request.getSession();
		String session_value = (String) session.getAttribute("session_name");
		ServletContext cxt = this.getServletContext();
		String servletcontext_value = (String) cxt.getAttribute("servletcontext_value");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head><title>A Servlet</title></head>");
		out.println("<body>");
		out.println(request_value);
		out.println(session_value);
		out.println(servletcontext_value);
		out.println("</body>");
		out.println("</html>");
		out.flush();
		out.close();
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
