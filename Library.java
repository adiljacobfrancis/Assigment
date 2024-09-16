import java.util.ArrayList;
import java.util.List;


public class Library
{
    private List<Book> books;
    private List<Member> members;

    public Library()
    {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    public void addBook(Book book)
    {
        books.add(book);
    }

    public void registerMember(Member member)
    {
        members.add(member);
    }

    public void lendBook(String isbn, String memberId)
    {
        Book book = findBookByIsbn(isbn);
        Member member = findMemberById(memberId);

        if (book != null && member != null && book.getCopiesAvailable() > 0)
        {
            member.borrowBook(book);
            book.setCopiesAvailable(book.getCopiesAvailable() - 1);
        }
    }

    private Book findBookByIsbn(String isbn)
    {
        for (Book book : books)
        {
            if (book.getIsbn().equals(isbn))
            {
                return book;
            }
        }
        return null;
    }

    private Member findMemberById(String memberId)
    {
        for (Member member : members) {
            if (member.getMemberId().equals(memberId))
            {
                return member;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Library library = new Library();


        Book book1 = new Book("The Robbery", "Kennedy Scott", "1890", 37);
        Book book2 = new Book("Great Expectation", "Charles Dickens", "3621", 44);
        library.addBook(book1);
        library.addBook(book2);


        Member member1 = new Member("Charles", "A637");
        Member member2 = new Member("John", "463");
        library.registerMember(member1);
        library.registerMember(member2);


        library.lendBook("4363", "327");
        library.lendBook("3732", "236");


        System.out.println("Copies of 'The Great Gatsby' available: " + book1.getCopiesAvailable());
        System.out.println("Copies of '1984' available: " + book2.getCopiesAvailable());
    }
}
