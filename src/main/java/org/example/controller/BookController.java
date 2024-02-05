package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.dto.BookDto;
import org.example.service.custom.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
@RequiredArgsConstructor
public class BookController {


    final BookService bookService;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public boolean save(@RequestBody BookDto dto){
        return bookService.save(dto);

    }

}
