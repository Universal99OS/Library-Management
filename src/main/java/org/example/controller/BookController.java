package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.dto.BookDto;
import org.example.entity.Book;
import org.example.service.custom.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
    @GetMapping("/read")
    @ResponseStatus(HttpStatus.ACCEPTED)
    Iterable<Book> getBooks(){
        return bookService.getBooks();
    }

}
