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
 * filter���Զ�ִ�еģ����õ��ã��������Ŀ����Դʱ�ͻ���á�
 */
public class MyFilter implements Filter {

   
    public MyFilter() {
    }

	
	public void destroy() {
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

		System.out.println("�ҵ�Filterִ�ˡ�����");
		chain.doFilter(request, response);
	}

		public void init(FilterConfig fConfig) throws ServletException {
	}

}