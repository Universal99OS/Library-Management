package org.example.controller;

import org.example.dto.BookDto;
import org.example.service.custom.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {

   @Autowired
    BookService bookService;
    @PostMapping
    public boolean save(@RequestBody BookDto dto){
        return bookService.save(dto);

    }

}
