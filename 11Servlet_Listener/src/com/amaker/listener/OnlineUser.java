package com.amaker.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;


public class OnlineUser implements ServletContextListener, HttpSessionListener {
	private int count;
	private ServletContext cxt;
  
    public OnlineUser() {
    }

	
    public void sessionCreated(HttpSessionEvent arg0)  { 
    
    	count++;
    	cxt.setAttribute("count", new Integer(count));
    }

	
    public void sessionDestroyed(HttpSessionEvent arg0)  { 
    	count--;
    	cxt.setAttribute("count", new Integer(count));
    }

	
    public void contextDestroyed(ServletContextEvent arg0)  { 
    
    	cxt = null;
    }

	
    public void contextInitialized(ServletContextEvent e)  { 
    
    	cxt = e.getServletContext();
    }
	
}
