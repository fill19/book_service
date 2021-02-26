package cursor.book_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class ControllerBook {

    @Autowired
    BooksRepository booksRepository;

    @GetMapping("/books")
    public List<Book> getBook(){
        return booksRepository.findAll();
    }
    @GetMapping("/books/{id}")
    public Book getBookById(@PathVariable("id") Long id) {
        return booksRepository.findById(id).orElse(null);
    }

    @GetMapping("/books/read/{id}")
    public Book getReadBefore(@PathVariable("id") Long id){
        Book book = booksRepository.findById(id).get();
        book.setReadBefore(true);
        booksRepository.save(book);
        return book;
    }
}
