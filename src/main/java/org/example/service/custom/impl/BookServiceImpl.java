package org.example.service.custom.impl;

import org.example.dto.BookDto;
import org.example.service.custom.BookService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Primary
public class BookServiceImpl implements BookService {
    @Override
    public boolean save(BookDto dto) {
        return false;
    }

    @Override
    public boolean update(BookDto dto) {
        return false;
    }

    @Override
    public boolean delete(String id) {
        return false;
    }

    @Override
    public List<BookDto> getAll() {
        return null;
    }
}
