package Libruary;

import java.util.Arrays;
import java.util.Comparator;

public class BookDemo {
    private Book[] New = new Book[3];

    public BookDemo(Book aNew, Book aNew1) {
        New[0] = aNew;
        New[1] = aNew1;
    }

    public BookDemo() {
        Book book1 = new Book();
        book1.setAutor("Кэти Сьерра и Берт Бейтс");
        book1.setName("JavaHeadFirst");
        book1.setGenre("Science");
        book1.setPublisher(2012);
        Book book2 = new Book();
        book2.setAutor("Дмитрий Глуховский");
        book2.setName("Metro2033");
        book2.setGenre("Fantasy");
        book2.setPublisher(2010);
        Book book3 = new Book();
        book3.setAutor("Дж.К. Роулинг");
        book3.setName("ГарриПоттер");
        book3.setGenre("Novel");
        book3.setPublisher(1997);
        New[0] = book1;
        New[1] = book2;
        New[2] = book3;
        Arrays.sort(New,new SortByPublisher());

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
    class SortByPublisher implements Comparator<Book> {
        public int compare(Book a, Book b) {
            if ( a.getPublisher() < b.getPublisher() ) return -1;
            else if ( a.getPublisher() == b.getPublisher() ) return 0;
            else return 1;
        }
    }
}

