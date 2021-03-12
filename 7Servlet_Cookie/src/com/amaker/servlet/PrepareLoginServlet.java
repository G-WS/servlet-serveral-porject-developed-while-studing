package com.amaker.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class PrepareLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public PrepareLoginServlet() {
        super();
    }

	
	public void init(ServletConfig config) throws ServletException {
	}

	
	public void destroy() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie [] cs = request.getCookies();
		if(cs!=null&&cs.length>0){
			for(int i = 0;i<cs.length;i++){
				Cookie c = cs[i];
				if(c.getName().equals("username")){
					String value = c.getValue();
					request.setAttribute("un", value);
				}
				if(c.getName().equals("password")){
					String value = c.getValue();
					request.setAttribute("pw", value);
				}
				
			}
			
		}
		request.getRequestDispatcher("/Login.jsp").forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
