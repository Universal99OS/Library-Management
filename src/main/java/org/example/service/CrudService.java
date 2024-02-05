package org.example.service;

import java.util.List;

public interface CrudService <T>{
    boolean save(T dto);
    boolean update(T dto);

    boolean delete(Long id);

    List<T> getAll();
}
