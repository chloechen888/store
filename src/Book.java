public class Book extends ReadingItem {
    String isbn;
    String edition;

    public Book(String name, String location, int price, String description,int wordCount, String datePublished, String author,String isbn,String edition) {
        super(name, location, price,description, wordCount, datePublished, author);
        this.isbn =isbn;
        this.edition = edition;
    }


    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    String title;
}
