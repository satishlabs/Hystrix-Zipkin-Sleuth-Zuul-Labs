package com.bookstorewebms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookstorewebms.proxy.BookSearchProxy;

@RestController
public class BookStoreController {
	@Autowired
	private BookSearchProxy bookSearchProxy;
	
	@GetMapping("/bookstore")
	public String getBookStorePrice() {
		System.out.println("BookStoreController --- getBookStorePrice()");
		String msg = bookSearchProxy.getBooks();
		return msg;
	}
}
