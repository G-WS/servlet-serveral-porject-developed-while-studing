package com.amaker.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/*
 * filter是自动执行的，不用调用，当你访问目标资源时就会调用。
 */
public class MyFilter implements Filter {

   
    public MyFilter() {
    }

	
	public void destroy() {
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

		System.out.println("我的Filter执了。。。");
		chain.doFilter(request, response);
	}

		public void init(FilterConfig fConfig) throws ServletException {
	}

}
