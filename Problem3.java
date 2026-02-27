class Book {
    private String title;
    private String author;
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    public String getTitle() {
        return title;
    }
}
class Professor {
    private String name;
    public Professor(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
class LibrarySystem {
    public void checkout(Professor p, Book b) {
        System.out.println(p.getName() + " has checked out " + b.getTitle() + " for research.");
    }
}
public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Data Structures", "Mark Allen");
        Professor prof1 = new Professor("Dr. Din Irfan-ud");
        LibrarySystem lib = new LibrarySystem();
        lib.checkout(prof1, book1);
    }
}
