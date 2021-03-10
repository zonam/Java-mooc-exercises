
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return this.name;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }
    
   public boolean equals (Object compared) {
       
       // convert the object to a Book object
        Book comparedBook = (Book) compared;
        
        // if the values of the object variables are equal, the objects are, too
        return this.name.equals(comparedBook.name) && this.publicationYear == comparedBook.publicationYear;
        
        // Above statement is same as
        /*if (this.name.equals(comparedBook.name)
                && this.publicationYear == comparedBook.publicationYear) {
            return true;
        }
        return false;*/
    }
}
