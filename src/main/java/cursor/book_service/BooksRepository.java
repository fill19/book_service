package cursor.book_service;

import org.springframework.data.jpa.repository.JpaRepository;


public interface BooksRepository extends JpaRepository<Book, Long> {


}
