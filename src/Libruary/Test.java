package Libruary;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;

public class Test {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setAutor("Говард Филипс Лавкрафт");
        book1.setName("Call of Ktulhu");
        book1.setGenre("Horror");
        book1.setPublisher(2016);
        //System.out.println(book1.toString());
        Book book2 = new Book();
        book2.setAutor("Дэн Хармон");
        book2.setName("Rick&Morty");
        book2.setGenre("Comics");
        book2.setPublisher(2017);
        //System.out.println(book2.toString());
        BookDemo bookDemo = new BookDemo(book1, book2);
        BookDemo bookDemo1 = new BookDemo();
        System.out.println(bookDemo1.toString());
        System.out.println(bookDemo.toString());
    }
}

