package lexicon.se;


public class BookLender {
    public static void main(String[] args) {
        // todo: needs completion
        Person person1 = new Person("1", "Jason", "Kav");


        Book book1 = new Book("1", "Davis book", "George Washington");
        System.out.println(book1.available());// true

        book1.setCurrentOwner(person1);

        System.out.println(book1.available());// false


        // Create a book instance
        // Display book information

        // Create a person instance
        // Display person information

        // Loan a book to the person

        // Display person information after borrowing a book
        // Display book information after borrowing a book

        // Return the borrowed book

        // Display person information after returning the book
        // Display book information after borrowing a book

    }

}