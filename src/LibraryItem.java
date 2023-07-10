public class LibraryItem {
    private int id;
    String title;
    int year;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}

class Book extends LibraryItem{
    String author;

    public Book(String author) {
        this.author = author;
    }
}

class Magazine extends LibraryItem{
    int issue;

    public Magazine(int issue) {
        this.issue = issue;
    }
}
