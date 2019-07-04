package ams.com.configuration;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import org.springframework.web.context.support.SpringBeanAutowiringSupport;


/*
 */
@SuppressWarnings("serial")
public class StartUpServlet extends HttpServlet
{
	
	public void init() throws ServletException
	{
		SpringBeanAutowiringSupport.processInjectionBasedOnCurrentContext(this);
		
	}
}