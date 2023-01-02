package com.cya.repos;

import com.cya.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Description 书籍
 */
@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {

    /**
     * ISBN编码查询
     * @param isbn
     * @return
     */
    Book findByIsbn(String isbn);
}
