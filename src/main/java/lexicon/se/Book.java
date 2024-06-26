package lexicon.se;

public class Book {

    private String id;
    private String title;
    private String author;
    private boolean available;
    private Person currentOwner;

    public Book(String id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.available = true;
        this.currentOwner = null;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle() {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean available() {
        return available;
    }

    public void setCurrentOwner(Person currentOwner) {
        // todo: if the current owner is not null -> update the availability to false -> else change it to true

        this.currentOwner = currentOwner;

        if (currentOwner != null)
            this.available = false;
        else {
            this.available = true;
        }

    }

    public Person getCurrentOwner ()
    {
        return currentOwner;
    }

    public String getBookInformation()

    {
        return String.format("BookID: " + id + "\nTitle: " + title + "\nAuthor: " + author + "\nAvailable: " + available + "\nOwner: " + currentOwner);
    }










}





