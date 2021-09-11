package com.springboot.tutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import com.springboot.tutorial.servlet.HelloFilter;
import com.springboot.tutorial.servlet.HelloListener;
import com.springboot.tutorial.servlet.HelloServlet;

@SpringBootApplication
public class SpringbootFirstAppApplication {
	
	// Register Servlet
	@Bean
	public ServletRegistrationBean getServletRegistrationBean() {
		ServletRegistrationBean servletBean = new ServletRegistrationBean(new HelloServlet());
		servletBean.addUrlMappings("/helloServlet");
		return servletBean;
	}
	
	// Register filter
	@Bean
	public FilterRegistrationBean getFilterRegistrationBean() {
		FilterRegistrationBean filterBean = new FilterRegistrationBean(new HelloFilter());
		filterBean.addUrlPatterns("/helloServlet");
		return filterBean;
	}
	
	@Bean
	public ServletListenerRegistrationBean<HelloListener> getServletListenerRegistrationBean() {
		ServletListenerRegistrationBean listenerBean = new ServletListenerRegistrationBean(new HelloListener());
		return listenerBean;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootFirstAppApplication.class, args);
	}

}
