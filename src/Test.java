import entity.Book;
import service.AuthorService;
import service.BookService;

public class Test {

    public static void main(String[] args) {

        AuthorService authorService=new AuthorService();
        BookService bookService=new BookService();

        authorService.register("hosein","Rezaee",24);


    }

}
