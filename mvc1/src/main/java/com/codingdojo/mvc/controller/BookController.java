package com.codingdojo.mvc.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.codingdojo.mvc.models.Book;
import com.codingdojo.mvc.services.BookService;

@Controller
@RequestMapping("/books")
public class BookController {
	//instance of service
	private final BookService bookService;
	
	public BookController(BookService bookService) {
		this.bookService=bookService;
	}
	
	@RequestMapping("")
	public String getAllBooks(Model model) {
		List<Book> books=bookService.getAllBooks();
		model.addAttribute("books",books);
		return "books/allBooks.jsp";
	}
	@RequestMapping("/{bookId}")
	public String viewBook(@PathVariable("bookId") Long bookId , Model model) throws Exception {
		Optional<Book> bookOptional =bookService.getBookById(bookId);
		if(!bookOptional.isPresent()) {
			throw new Exception("the book not founded in our records "+ bookId );
		}
		Book book=bookOptional.get();
		model.addAttribute(book);
		return "books/viewBook.jsp"; 
	}
	
	@RequestMapping(value="/create" , method=RequestMethod.GET)
	public String createBook() {
		return "books/createBook.jsp";
	}
	@RequestMapping(value="/create" , method=RequestMethod.POST)
	public String storeBook(
			@RequestParam(value="title") String title,
			@RequestParam(value="languages") String languages,
			@RequestParam(value="pages") Integer pages,
			@RequestParam(value="discription") String discription,
			RedirectAttributes redirectAttributes
			) {
		
		//create instance of create book inside service and giv it the argument that inside Book model  
		Book book=new Book(title,discription,languages,pages);
		bookService.createBook(book);
		redirectAttributes.addFlashAttribute("seuccess", "book creates ...");
		return "redirect:/books";
	}
	

}
