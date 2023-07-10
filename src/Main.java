// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Book book = new Book("Varun");
        Magazine magazine = new Magazine(2006);
        book.setId(1001);
        book.title = "World and wild";
        book.year = 2002;
        System.out.println(book.getId() +" "+ book.title + " written by " + book.author + " in the year "+ book.year);

        magazine.setId(1002);
        magazine.year = 2004;
        magazine.title = "Times Now";
        System.out.println(magazine.getId() +" "+ magazine.title + " is issued in the year " + magazine.issue);
    }
}