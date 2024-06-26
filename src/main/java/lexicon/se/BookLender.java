package lexicon.se;


public class BookLender {
    public static void main(String[] args) {
        // todo: needs completion

        // Create a book instance
        // Display book information

        Book book1 = new Book("1", "Genghis Khan", "George Washington");
        Book book2 = new Book("2", "Jupiter", "George Bush");


        System.out.println(book1.getBookInformation());// true

        // Create a person instance
        // Display person information

        Person person1 = new Person("1", "Jason", "Davids");
        Person person2 = new Person("2", "Mohammed", "Ali");

        System.out.println(person1.getPersonInformation());



        // Loan a book to the person
        System.out.println("\nPerson1 has loaned book 1\n");
        person1.loanBook(book1);

        // Display person information after borrowing a book
        System.out.println("\nNew person information\n");
        System.out.println(person1.getPersonInformation());

        // Display book information after borrowing a book
        System.out.println("\nNew book information\n");
        System.out.println(book1.getBookInformation());

        // Return the borrowed book
        System.out.println("\nPerson1 has returned book1\n");
        person1.loanBook(book1);

        // Display person information after returning the book

        System.out.println("\nPerson1 returned information\n");
        System.out.println(person1.getPersonInformation());

        // Display book information after borrowing a book

        System.out.println("\nPerson1 returned book1 information\n");
        System.out.println(book1.getBookInformation());
    }

}