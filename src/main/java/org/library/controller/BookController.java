package org.library.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.library.model.Books;
import org.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/library/book")
public class BookController {
	
	@Autowired
	BookService bookservice;

	@RequestMapping(value="/save",method=RequestMethod.POST)
	public @ResponseBody String saveBook(@PathVariable Books book){
		
		bookservice.saveBook(book);
		return null;
		
	}
	
	
}
