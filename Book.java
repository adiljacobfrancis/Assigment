import java.util.ArrayList;
import java.util.List;
public class Book
{
    public String title;
    public String author;
    private String isbn;
    int copiesAvailable;

    public Book(String title, String author, String isbn, int copiesAvailable)
    {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.copiesAvailable = copiesAvailable;
    }

    public String getIsbn()
    {
        return isbn;
    }

    public void setCopiesAvailable(int copies)
    {
        this.copiesAvailable = copies;
    }

    int getCopiesAvailable()
    {
        return copiesAvailable;
    }
}


