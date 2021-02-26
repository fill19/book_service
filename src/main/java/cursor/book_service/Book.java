package cursor.book_service;

import lombok.Data;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Book {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private boolean readBefore;

    public Book(String name) {
        this.name = name;

    }

    public Book() {
    }

    public void setReadBefore(boolean readBefore) {
        this.readBefore = readBefore;
    }
}
