package library;

public class Books {
    String book_name;
    int book_id;
    String author;
    int isbn;
    int published_year;

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getPublished_year() {
        return published_year;
    }

    public void setPublished_year(int published_year) {
        this.published_year = published_year;
    }

    public Books(String book_name, int book_id, String author, int isbn, int published_year) {
        this.book_name = book_name;
        this.book_id = book_id;
        this.author = author;
        this.isbn = isbn;
        this.published_year = published_year;
    }
    public void book_format(){

        System.out.println("Name"+" :  "+" "+this.book_name);
        System.out.println("Author"+" :  "+""+this.author);
        System.out.println("ISBN"+" :  "+" "+this.isbn);
        System.out.println("Published Year"+" :  "+""+this.published_year);
    }
}
