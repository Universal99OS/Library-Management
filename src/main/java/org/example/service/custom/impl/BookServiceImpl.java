package org.example.service.custom.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.example.dto.BookDto;
import org.example.entity.Book;
import org.example.repository.BookRepository;
import org.example.service.custom.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Primary
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    final BookRepository bookRepository;
    @Autowired
    ObjectMapper mapper;
    @Override
    public boolean save(BookDto dto) {
        Book book = mapper.convertValue(dto, Book.class);
        bookRepository.save(book);
        return true;
    }

    @Override
    public boolean update(BookDto dto) {
        return false;
    }

    @Override
    public boolean delete(Long id) {
        if(bookRepository.existsById(id)){
            bookRepository.deleteById(id);
            return true;
        }else {
            return false;
        }
    }


    @Override
    public List<BookDto> getAll() {
        return null;
    }


    @Override
    public List<Book> getBooks() {
        return bookRepository.findAll();
    }
}
