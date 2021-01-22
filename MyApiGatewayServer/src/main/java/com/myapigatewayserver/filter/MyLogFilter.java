package com.myapigatewayserver.filter;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

@Component
public class MyLogFilter extends ZuulFilter{
		
	Logger logger=LoggerFactory.getLogger(this.getClass()); 
	
	@Override
	public Object run() throws ZuulException {
		logger.info("---1. MyLogFilter---run()"); 
		//Write logic here
		HttpServletRequest request = RequestContext.getCurrentContext().getRequest();
		String URI = request.getRequestURI();
		logger.info("RequestFrom{}",URI);
		return null;
	}
	
	@Override
	public String filterType() {
		return "pre";  //Herre we can use pre,post,error
	}
	
	@Override
	public int filterOrder() {
		return 1;  // how many filter and which order want to execute
	}
	
	@Override
	public boolean shouldFilter() {
		return true;  //You want to continue next or want to go back
	}

	



}
