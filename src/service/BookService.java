package service;

import entity.Book;

public class BookService {

    public void addBook(String title, String printYear, int authorId) {

        Book book = new Book();
        book.setTitle(title);
        book.setPrintYear(printYear);
        book.setAuthorId(authorId);

    }
}




