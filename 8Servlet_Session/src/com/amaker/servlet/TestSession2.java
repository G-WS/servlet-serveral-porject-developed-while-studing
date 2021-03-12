package com.amaker.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/*
 * Session是用来跟踪用户当前状态的一种机制，是针对浏览器和服务器一对一关系
 * Session的一般用法是，在用户登陆时将用户的登陆信息保存到session中，以便以后使用
 * 
 * */
public class TestSession2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public TestSession2() {
        super();
    }

	
	public void init(ServletConfig config) throws ServletException {
	}

	
	public void destroy() {
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//获得session实例。该接口的实现由容器提供
				HttpSession session = request.getSession();
				
			
				//获得数据
				
				String username = (String)session.getAttribute("Username");
				
				response.setContentType("text/html");
				PrintWriter out = response.getWriter();
				out.println("<!DOCTYPE html>");
				out.println("<html>");
				out.println("<head><title>A Servlet</title></head>");
				out.println("<body>");
				out.println("Username"+username);
				out.println("</body>");
				out.println("</html>");
				out.flush();
				out.close();
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
