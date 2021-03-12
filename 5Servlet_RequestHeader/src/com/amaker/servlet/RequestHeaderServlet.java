package com.amaker.servlet;

/*
 * 读取请求头信息
 *	-使用HpptServletRequest中的方法
 *	 	一般方法
 *		-getHeader(header名称不区分大小写)
 *		-getHeaders
 *		-getHeaderNames
 *		专门方法
 *		-getCookies
 *		-getAuthType
 *		-getRemoteUser
 *		-getContentLength
 *		-getContentType
 *		-getDateHeader
 *		相关信息
 *		-getMethod
 *		-getRequestURL
 *		-getQueryString
 *		-getProtocol
 *
 */
/*
 * 理解各种请求头的含义
 * 		-ACCEPT
 * 			表示浏览器能处理的MIME类型 
 * 			能发送不同的内容到不同的客户端，例如PNG文件有好的压缩特性，但是在浏览器中支持的不是很广泛
 * 		-Accept-Encoding
 * 			次奥是浏览器能处理的编码类型
 *  	-Authorization
 *  		授权信息，通常出现在对服务器发送的www-Authenticate头的应答中
 *   	-Connection
 *   		标志是够需要持久连接，如果是keep-alive，则代表是持久连接
 *      -cookie
 *      	见后续
 *  	-host
 *  		包含一个url，用户从该url代表的页面出发访问当前请求的页面
 *   	-if-modified-since
 *   		只有当所有请求的内容，在制定的日期只够，又经过修改才返回它
 *   		，否则返回304
 *   	-Referer
 *   		包含一个url用户从该url待变的页面出发访问当前请求的页面
 *   	-User-Agent
 *   		浏览器类型
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestHeaderServlet
 */
public class RequestHeaderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public RequestHeaderServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	
		Enumeration enu = request.getHeaderNames();
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("   <head><title>A Servlet</title></head>");
		out.println("   <body>");
		out.print("   <table>");
		out.print("<tr>");
			out.print("<th>");
				out.print("HeaderName");
			out.print("</th>");
			
			out.print("<th>");
				out.print("HeaderValue");
			out.print("</th>");
		out.print("</tr>");
		
		
		while(enu.hasMoreElements()){
			String headerName = (String)enu.nextElement();
			String headerValue = request.getHeader(headerName);
			
			out.print("<tr>");
			out.print("<td>");
				out.print(headerName);
			out.print("</td>");

			out.print("<td>");
				out.print(headerValue);
			out.print("</td>");
		}
		out.print("   </table>");
		out.println("</body>");
		out.println("</html>");
		out.flush();
		out.close();
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	
	public void destroy() {
		super.destroy();
	}

	
	public void init() throws ServletException {
		super.init();
	}
	

}
