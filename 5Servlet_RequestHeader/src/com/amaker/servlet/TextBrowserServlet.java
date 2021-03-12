package com.amaker.servlet;
/*此Servlet类通过请求的来的头信息来判断浏览器是否是某种类型的浏览器
*此方法Servlet类用于判断是否是IE浏览器
*/
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TextBrowserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public TextBrowserServlet() {
        super();
    }


	public void init(ServletConfig config) throws ServletException {
			}


	public void destroy() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String browser = request.getHeader("user-agent");
		
		response.setContentType("text/html;charset=gbk");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("   <head><title>A Servlet</title></head>");
		out.println("   <body>");
		
		if(browser!=null&&browser.indexOf("MSIE")!=-1){
			out.println("您是用的是IE浏览器");
		}else{
			out.println("您使用的是非IE浏览器");
		}
		
		out.println("</body>");
		out.println("</html>");
		out.flush();
		out.close();
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
