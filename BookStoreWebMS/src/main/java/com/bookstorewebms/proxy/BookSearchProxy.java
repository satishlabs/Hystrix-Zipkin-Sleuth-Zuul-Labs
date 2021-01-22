package com.bookstorewebms.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

//@FeignClient(name = "MyBookSearchMS")
@FeignClient(name = "MyApiGatewayServer")
public interface BookSearchProxy {
	
	@GetMapping("/MyBookSearchMS/mybooks")
	public String getBooks();
}
