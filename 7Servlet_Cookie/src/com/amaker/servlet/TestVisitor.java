package com.amaker.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class TestVisitor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public TestVisitor() {
        super();
    }

	
	public void destroy() {
		super.destroy();
	}


	public void init() throws ServletException {
		super.init();
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		Cookie []cs = request.getCookies();
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head><title>A Servlet</title></head>");
		out.println("<body>");
		String msg = "welcome";
		
		if(cs!=null&&cs.length>0){
			for(int i = 0;i<cs.length;i++){
				Cookie c = cs[i];
				if(c.getName().equals("yes")){
					msg = "welcome back!";
				}else{
					Cookie newCookie = new Cookie("yes","1");
					response.addCookie(newCookie);
					newCookie.setMaxAge(60*60*24*7);
				}
			}
		}
		out.println(msg);
		out.println("</body>");
		out.println("</html>");
		out.flush();
		out.close();
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
