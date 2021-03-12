package com.amaker.listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.annotation.WebListener;


public class ServletContextAttributeListenerTest implements ServletContextAttributeListener {

   
    public ServletContextAttributeListenerTest() {
    }

	//Ìí¼Ó
    public void attributeAdded(ServletContextAttributeEvent event)  { 
    
    	System.out.println("attributeAdded......");
    }

	//É¾³ý
    public void attributeRemoved(ServletContextAttributeEvent event)  { 
    
    	System.out.println("attributeRemoved......");

    }

	//Ìæ»»
    public void attributeReplaced(ServletContextAttributeEvent event)  { 
    
    	System.out.println("attributeReplaced......");

    }
	
}
