package OOP.Incapsulation;

import java.util.ArrayList;

public class Author {

    private String name;
    private String surname;
    private String birthDate;
    private ArrayList<Book> books;

    public Author(String name, String surname, String birthDate) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.books = new ArrayList<Book>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void addBook(String title, int papers, String publisher) {
        Book book = new Book(title, this, papers, publisher);
        this.books.add(book);
    }

}
