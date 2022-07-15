package OOP.Incapsulation;

import OOP.Incapsulation.Author;

public class Book {
    private String title;
    private Author author;
    private int papers;
    private String publisher;

    public Book(String title, Author author, int papers, String publisher) {
        this.title = title;
        this.author = author;
        this.papers = papers;
        this.publisher = publisher;

        this.author.addBook(title, papers, publisher);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getPapers() {
        return papers;
    }

    public void setPapers(int papers) {
        this.papers = papers;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
