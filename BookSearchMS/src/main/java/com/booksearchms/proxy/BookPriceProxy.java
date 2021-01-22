package com.booksearchms.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

//@FeignClient(name = "MyBookPriceMS")
@FeignClient(name = "MyApiGatewayServer")
public interface BookPriceProxy {
	
	@GetMapping("/MyBookPriceMS/bookPrice")
	public String getBookPrice();
}
