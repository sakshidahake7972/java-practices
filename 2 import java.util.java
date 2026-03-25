import java.util.ArrayList;

class Book {
    String title, author, ISBN;

    Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    void display() {
        System.out.println(title + " - " + author + " - " + ISBN);
    }
}

class Library {
    ArrayList<Book> books = new ArrayList<>();

    void addBook(Book b) {
        books.add(b);
    }

    void removeBook(String ISBN) {
        books.removeIf(book -> book.ISBN.equals(ISBN));
    }

    void displayBooks() {
        for (Book b : books) {
            b.display();
        }
    }

    public static void main(String[] args) {
        Library lib = new Library();

        lib.addBook(new Book("Java Basics", "Author A", "101"));
        lib.addBook(new Book("OOP Concepts", "Author B", "102"));

        System.out.println("Books in Library:");
        lib.displayBooks();

        lib.removeBook("101");

        System.out.println("\nAfter Removing Book:");
        lib.displayBooks();
    }
}