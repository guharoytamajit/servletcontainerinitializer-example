package com;

import java.util.Set;
import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

public class MyServletContainerInitializer implements ServletContainerInitializer {

	@Override
	public void onStartup(Set<Class<?>> arg0, ServletContext servletContext) throws ServletException {
		servletContext.addServlet("testServlet", TestServlet.class).addMapping("/login");

	}

}
