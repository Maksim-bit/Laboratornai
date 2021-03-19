package Libruary;

import java.util.Arrays;
import java.util.Date;

public class BookDemo {
    private Book[] New = new Book[2];

    public BookDemo(Book aNew, Book aNew1) {
        New[0] = aNew;
        New[1] = aNew1;
    }

    public BookDemo() {
        Book book1 = new Book();
        book1.setAutor("Кэти Сьерра и Берт Бейтс");
        book1.setName("JavaHeadFirst");
        book1.setGenre("Science");
        book1.setPublisher(new Date());
        Book book2 = new Book();
        book2.setAutor("Дмитрий Глуховский");
        book2.setName("Metro2033");
        book2.setGenre("Fantasy");
        book2.setPublisher(new Date());
        New[0] = book1;
        New[1] = book2;

    }

    public Book[] getNew() {
        return New;
    }

    public void setNew(Book[] aNew) {
        New = aNew;
    }

    @Override
    public String toString() {
        return "BookDemo{" +
                "New=" + Arrays.toString(New) +
                '}';
    }
}

