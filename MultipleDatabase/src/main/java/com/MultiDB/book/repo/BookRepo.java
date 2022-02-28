package com.MultiDB.book.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MultiDB.model.book.Book;

@Repository
public interface BookRepo extends JpaRepository<Book ,Integer> {
  
}
