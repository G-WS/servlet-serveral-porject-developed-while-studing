package com.amaker.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionBindingEvent;


public class HttpSessionAttributeListener implements javax.servlet.http.HttpSessionAttributeListener {

   
    public HttpSessionAttributeListener() {
    }

	
    public void attributeAdded(HttpSessionBindingEvent arg0)  { 
   
        System.out.println("attributeAdded");

    }

	
    public void attributeRemoved(HttpSessionBindingEvent arg0)  { 
    
        System.out.println("attributeRemoved");

    }

    
    public void attributeReplaced(HttpSessionBindingEvent arg0)  { 
    
        System.out.println("attributeReplaced");

    }
	
}
