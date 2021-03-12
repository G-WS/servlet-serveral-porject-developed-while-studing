package com.amaker.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class SessionFilter implements Filter {

   
    public SessionFilter() {
    }

	
	public void destroy() {
	}

	public void doFilter(ServletRequest r, ServletResponse res, FilterChain chain) throws IOException, ServletException {
		
		chain.doFilter(r, res);
		HttpServletRequest request = (HttpServletRequest)r;
		HttpSession session = request.getSession();
		String user = (String)session.getAttribute("User");
		HttpServletResponse response = (HttpServletResponse)res;
		if(user!=null&&!user.equals(" ")){
			chain.doFilter(request, response);
		}else{
			String msg = "你还没有登陆";
			request.setAttribute("error", msg);
					
		}
		r.getRequestDispatcher("/Login.jsp").forward(r, res);//跳转只可以跳转动态页面（jsp），不能跳转HTML静态页面
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
	}

}
