class Book {
    // Fields to hold book details
    public String bookTitle;
    public String bookAuthor;
    public int bookYearOfPublication;

    // Method to print book title
    public void title() {
        System.out.println("Book Title");
    }

    // Method to print book author
    public void author() {
        System.out.println("Book Year of Publishing");
    }

    // Main Method
    public static void main(String[] args) {
        // First book
        Book book1 = new Book();
        book1.bookTitle = "Atomic Habits";
        book1.bookAuthor = "James Clear";
        book1.bookYearOfPublication = 2018;

        // Calling methods
        book1.title();
        book1.author();

        // Printing book details
        System.out.println("Book title is: " + book1.bookTitle);
        System.out.println("Book author is: " + book1.bookAuthor);
        System.out.println("Book year of publication is: " + book1.bookYearOfPublication);

        // Second book
        Book book2 = new Book();
        book2.bookTitle = "South Pole Pig";
        book2.bookAuthor = "James";
        book2.bookYearOfPublication = 2014;

        // Calling methods
        book2.title();
        book2.author();

        // Printing book details
        System.out.println("Book title is: " + book2.bookTitle);
        System.out.println("Book author is: " + book2.bookAuthor);
        System.out.println("Book year of publication is: " + book2.bookYearOfPublication);
    }
}