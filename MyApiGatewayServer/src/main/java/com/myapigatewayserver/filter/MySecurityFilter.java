package com.myapigatewayserver.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;

@Component
public class MySecurityFilter extends ZuulFilter{
		
	Logger logger=LoggerFactory.getLogger(this.getClass()); 
	
	@Override
	public Object run() throws ZuulException {
		logger.info("---2. MySecurityFilter---run()"); 
		//Write logic here
		
		logger.info("Authotentication Done Successfully");
		return null;
	}
	
	@Override
	public String filterType() {
		return "pre";  //Herre we can use pre,post,error
	}
	
	@Override
	public int filterOrder() {
		return 2;  // how many filter and which order want to execute
	}
	
	@Override
	public boolean shouldFilter() {
		return true;  //You want to continue next or want to go back
	}

	



}
