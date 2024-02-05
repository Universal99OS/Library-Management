package org.example.service.custom;

import org.example.dto.BookDto;
import org.example.entity.Book;
import org.example.service.CrudService;

import java.util.List;

public interface BookService extends CrudService<BookDto> {

    List<Book> getBooks();

    BookDto getBookById(Long id);
}
