package com.codingdojo.mvc.services;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.codingdojo.mvc.models.Book;
import com.codingdojo.mvc.repositories.BookRepository;
@Service
public class BookService {
    // adding the book repository as a dependency
    private final BookRepository bookRepository;
    
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    
    public Optional<Book> getBookById(Long bookId) {
    	return bookRepository.findById(bookId);
    }
    
    // returns all the books
   public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }
    // creates a book
    public Book createBook(Book b) {
        return bookRepository.save(b);
    }
    // retrieves a book
    public Book findBook(Long id) {
       Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
           return optionalBook.get();
        } else {
            return null;
        }
    }
}
   
