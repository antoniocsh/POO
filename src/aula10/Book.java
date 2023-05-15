package aula10;

public class Book {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString() {
        return "Title: " + title + "; Author: " + author + "; Year: " + year;
    }

    public boolean equals(Book b) {
        return (this.title.equals(b.getTitle()) && this.author.equals(b.getAuthor()) && this.year == b.getYear());
    }

    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + (this.title != null ? this.title.hashCode() : 0);
        hash = 31 * hash + (this.author != null ? this.author.hashCode() : 0);
        hash = 31 * hash + this.year;
        return hash;
    }

}
