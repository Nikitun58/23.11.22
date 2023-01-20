import java.util.Objects;
public  class Book {
    private final String name;
    private final Author authorName;
    private int publicationYear;
    public Book (String name, int publicationYear, Author authorName) {
        this.name = name;
        this.authorName = authorName;
        this.publicationYear = publicationYear;

    }
    public String getName(){

        return name;
    }
    public Author getAuthorName() {

        return authorName;
    }
    public int getpublicationYear() {

        return publicationYear;
    }
    public void setpublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
    @Override
    public String toString() {
        return  name+ "\nКнига: " + authorName + "\nГод издания: " + publicationYear;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publicationYear == book.publicationYear && Objects.equals(name,book.name ) && Objects.equals(authorName, book.authorName);
    }
    @Override
    public int hashCode() {
        return Objects.hash (name, authorName, publicationYear) ;
    }

}