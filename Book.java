public class Book {
    int book_id;
    String title;
    String author;

    Book() {
        System.out.println("Default Constructor");

    }

    Book(int b1, String t1, String a1) {
        System.out.println("Parameterized Constructor");
        book_id = b1;
        title = t1;
        author = a1;
    }

    void display() {
        System.out.println("Book id is= " + book_id + " Title name= " + title + " Author name=" + author);
    }

    public static void main(String[] args) {
        Book b = new Book();
        b = new Book(100, "c++", "Bjarne Stroustrup");
        b.display();
    }
}