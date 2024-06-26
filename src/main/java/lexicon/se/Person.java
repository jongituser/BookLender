package lexicon.se;

public class Person
{
    private int sequencer = 0;
    private String id;
    private String firstName;
    private String lastName;
    private boolean loanedBook;
    private boolean returnedBook;

    public Person(String id, String firstName, String lastName)
    {

        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.loanedBook = false;
        this.returnedBook = false;


    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isLoanedBook()
    {
        return loanedBook;
    }

    public void setLoanedBook(boolean loanedBook) {
        this.loanedBook = loanedBook;
    }

    public boolean isReturnedBook() {
        return returnedBook;
    }

    public void setReturnedBook(boolean returnedBook) {
        this.returnedBook = returnedBook;
    }

    public void getBookLoanInformation()
    {

    }

    public String getPersonInformation()

    {
 return String.format("PersonID: " + id + "First Name: " + firstName + "Last Name:  " + lastName + "Loaned book: " +loanedBook + "Returned book: " +returnedBook );
    }

}
