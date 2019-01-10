package com.web.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebXmlInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	//this class is the replacement of web.xml file
	
	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		//here we have to return classes which are the replacement of servletmvc-servlet.xml
		return new Class[] {ServletXmlConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		
		return new String[] {"/"};
	}

	
/*
   <servlet>
      <!-- name provided in <servlet-name> tag will be used in calling the configuration file for DispatcherServlet -->
  	  <servlet-name>springmvc</servlet-name> <!-- configuration file name will become springmvc-servlet.xml & should be located inside the WEB-INF directory otherwise we will get HTTP Status 500 – Internal Server Error-->
  	  <servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>  <!-- to use this class we need to add some dependencies in pom.xml -->
  </servlet>
  
  <servlet-mapping>
  		<servlet-name>springmvc</servlet-name>
  		<url-pattern>/</url-pattern>      <!-- / is used to send any request -->
  </servlet-mapping>	
 */
	
}
