import com.workintech.library.Library.Library;
import com.workintech.library.bookcase.Book;
import com.workintech.library.enums.Genre;
import com.workintech.library.enums.Status;
import com.workintech.library.enums.User;
import com.workintech.library.members.Librarian;
import com.workintech.library.members.Person;
import com.workintech.library.members.Student;




public class Main {
    public static void main(String[] args) {

//    public Book(long id, String author, String name, double price, Status status,
//    int edition,  Genre genre) {
       Book book1 = new Book(1L, "CHARLES DARWIN", "ON THE ORIGIN OF SPECIES", 100, Status.AVAILABLE, 12, Genre.SCIENTIFIC);
       Book book2 = new Book(2L, "F SCOTT FITZGERALD", "THE GREAT GATSBY", 80, Status.AVAILABLE, 17, Genre.NOVEL);
       Book book3 = new Book(3L, "J.D. SALINGER", "THE CATCHER IN THE RYE", 120, Status.AVAILABLE, 4, Genre.NOVEL);
       Book book4 = new Book(4L, "GEORGE ORWELL", "1984", 40, Status.AVAILABLE, 28, Genre.SCIENTIFIC);
       Book book5 = new Book(5L, "J.R.R. TOLKIEN", "LORD OF THE RINGS TRILOGY", 300, Status.AVAILABLE, 12, Genre.NOVEL);

        Person student = new Student("Melih Can Sunay", "1234", User.STUDENT);
        Person librarian = new Librarian("Melvil Dewey", "4321", User.LIBRARIAN);

        Library bookcase = new Library();
        bookcase.addBook(book1);
        bookcase.addBook(book2);
        bookcase.addBook(book3);
        bookcase.addBook(book4);
        bookcase.addBook(book5);
     //   System.out.println(bookcase.getBookcase());
     //   System.out.println(bookcase.getBookByName("LORD OF THE RINGS TRILOGY"));
     //   System.out.println(bookcase.getBookByAuthor("J.R.R. TOLKIEN"));
        System.out.println(bookcase.removeBookById(1L));
        System.out.println(bookcase.getBookcase());

    }
}