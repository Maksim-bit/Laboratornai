package Libruary;

import java.util.Date;

public class Book {
    private String name;
    private String autor;
    private int publisher;
    private String genre;
    private static Owner owner;

    public Book() {
    }


     public Book (String name, String autor, int publisher, String genre) {
     this.name = name;
     this.autor = autor;
     this.publisher = publisher;
     this.genre = genre;
     setOwner(new Owner("Somebody"),"1234");
     } //Todo конструктор
    public Book (String name, String autor, int publisher, String genre,String nameOwner,String password) {
        this.name = name;
        this.autor = autor;
        this.publisher = publisher;
        this.genre = genre;
        setOwner(new Owner(nameOwner),password);
    } //Todo конструктор в котором можно указать владельца книги если введён верный пароль


    public static Owner getOwner() {
        return owner;
    }
    public static void setOwner(Owner owner,String password) {
        if (password !="1234") {
            Book.owner = owner;
        } else {
            System.out.println("Пароль не верный.");
        }//Todo принцип инкапсуляции
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPublisher() {
        return publisher;
    }

    public void setPublisher(int publisher) {
        this.publisher = publisher;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", autor='" + autor + '\'' +
                ", publisher=" + publisher +
                ", genre='" + genre + '\'' +
                '}';
    }//Todo выводит значения построчно
}
