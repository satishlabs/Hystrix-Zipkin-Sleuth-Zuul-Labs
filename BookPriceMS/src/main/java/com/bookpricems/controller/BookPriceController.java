package com.bookpricems.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class BookPriceController {
	
	@Value(value = "${server.port}")
	String serverPort;
	
	@HystrixCommand(fallbackMethod = "getBookPriceFallback")
	@GetMapping("/bookPrice")
	public String getBookPrice() {
		System.out.println("BookPriceController --- getBookPrice()"+serverPort);
		String msg = "BookPriceInfo is Ready -- Test and Check the application ---: "+serverPort;
		return msg;
	}
	
	public String getBookPriceFallback() {
		System.out.println("BookPriceController --- getBookPriceFallback()");
		String msg = "Something Wrong here"+serverPort;
		return msg;
	}
}
