package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.dto.BookDto;
import org.example.entity.Book;
import org.example.service.custom.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
@RequiredArgsConstructor
public class BookController {


    final BookService bookService;
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public boolean save(@RequestBody BookDto dto){
        return bookService.save(dto);

    }
    @GetMapping("/get")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Iterable<Book> getBooks(){
        return bookService.getBooks();
    }
    @DeleteMapping("/delete {id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public ResponseEntity<String > delete(@PathVariable Long id){
        return bookService.delete(id)?
                ResponseEntity.ok("Deleted"):
                ResponseEntity.notFound().build();
    }

    @GetMapping("/search/{id}")
    @ResponseStatus(HttpStatus.FOUND)
    public BookDto getBookById(@PathVariable Long id){
        return bookService.getBookById(id);
    }


}
