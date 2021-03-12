package com.amaker.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BasicServlet extends HttpServlet{
	//构造方法
	public BasicServlet(){
		System.out.println("BasicServlet");
	}
	
	
	
	/*此方法用于初始化
	 * 并且可以获得初始化的局部的参数
	 * 还可以获得全局的初始化参数
	 * */
	@Override
	public void init() throws ServletException {
		String url = this.getServletContext().getInitParameter("url");
		System.out.println(url);
		String username = this.getInitParameter("username");
		System.out.println(username);
		System.out.println("init");
	}

	
	
	/*get方法的缺陷是会将用户所查询的信息出现在地址，
	*而且还可以被缓存，相较于post来说不太安全
	*/
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		PrintWriter out = response.getWriter();
		out.println("my servlet");
		//请求重定向，不共享request中的内容
		if(username!=null&&username.equals("amaker")){
			
			request.getRequestDispatcher("/Success.html").include(request, response);	//请求包含

			//request.getRequestDispatcher("/Success.html").forward(request, response);	
			//response.sendRedirect("http://google.cn");//请求转发
		}
		else{
			request.getRequestDispatcher("/Failure.html").forward(request, response);
		}
		
		System.out.println("doGet");
		
	}
	
	/*post的优势在于不会将所搜索的问题显示在url中
	 * 相对于get来说比较安全，但是如果涉及隐秘敏感问题最好还是用加密请求
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost");
	}
	/*service里面才会判断是否是doGet还是doPost
	*如果没有service，则是看在表单中使用的是post还是get
	*一般使用post
	*/
	
	/*protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("service");
	}*/
	/*此方法用于销毁
	 */
	@Override
	public void destroy() {
		System.out.println("distory");
	}
	
	

}
