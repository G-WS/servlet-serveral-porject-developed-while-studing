package com.amaker.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;


public class HttpSessionListener implements javax.servlet.http.HttpSessionListener {

   
    public HttpSessionListener() {
    }

	
	public void sessionCreated(HttpSessionEvent arg0) {
		System.out.println("sessionCreated");
	}

	public void sessionDestroyed(HttpSessionEvent arg0) {
		System.out.println("sessionDestroyed");

	}
	
}
