package com.example.systemlibrary.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.systemlibrary.model.Books;

public interface BooksRepository extends CrudRepository<Books, Integer> {

}
