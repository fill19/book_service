package cursor.book_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

@Component
public class DataCLR implements CommandLineRunner {

    @Autowired
    BooksRepository booksRepository;

    @Override
    public void run(String... args)  {
        Stream.of(
                "Chuck",
                "David",
                "Frank",
                "Jackson"
        )
                .forEach(book -> booksRepository.save(new Book(book)));
    }
}
