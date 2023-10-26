package com.library_catalog_system.view;

import com.library_catalog_system.controller.LibraryController;
import com.library_catalog_system.model.Author;
import com.library_catalog_system.model.Book;

import java.util.Collection;

/**
 * <p>
 * This class gets input from the user and passes to the controller
 * </p>
 *
 * @author Petchimuthu Pitchiah
 * @version 1.0
 */
public class Main {
    final LibraryController controller = LibraryController.getInstance();

    /**
     * <p>
     * Attempts to create an instance of Author
     * </p>
     *
     * @return instance of an Author
     */
    private Author createAuthor(String authorName, String phoneNo) {
        final Author author = new Author();

        author.setName(authorName);
        author.setPhoneNumber(phoneNo);

        return author;
    }

    /**
     * <p>
     * Attempts to create the book and passes it to the controller
     *
     * @param author Author of the book
     *               </p>
     * @return instance of a book
     */
    private Book addBook(final Author author) {
        final Book hamlet = new Book();

        hamlet.setTitle("Hamlet");
        hamlet.setAuthor(author);
        hamlet.setISBN();
        hamlet.setCount(10);
        controller.addBook(hamlet);

        return hamlet;
    }

    /**
     * <p>
     * Attempts to send the instance of the book to the controller
     * </p>
     * <p>
     * returns value from the controller
     *
     * @param book Instance of a book to be removed
     */
    private boolean removeBook(final Book book) {
        return controller.removeBook(book);
    }

    /**
     * <p>
     * Attempts to send the title of a book to the controller and
     * returns value from the controller
     * </p>
     *
     * @param title title of the book to be searched
     */
    private Collection<String> searchByTitle(final String title) {
        return controller.searchBookByTitle(title);
    }

    /**
     * Attempts to send the author's name to the controller and
     * returns value from the controller
     *
     * @param name name of the author to be searched
     */
    private Collection<String> searchByAuthor(final String name) {
        return controller.searchBookByAuthor(name);
    }

    /**
     * Attempts to send the instance of the book to the controller and
     * returns value from the controller
     *
     * @param book instance of the book to be lent
     * @return value that controller gets
     */
    private int lendBook(final Book book) {
        return controller.lendBook(book);
    }

    /**
     * Attempts to send the instance of the book to the controller and
     * returns value from the controller
     *
     * @param book instance of the book to be lent
     * @return value that controller gets
     */
    private int returnBook(final Book book) {
        return controller.returnBook(book);
    }

    public static void main(String[] args) {
        final Main main = new Main();
        final Author shakespeare = main.createAuthor("Shakespeare", "8807424486");
        final Book hamlet = main.addBook(shakespeare);

        System.out.println(main.searchByAuthor("Shakespeare"));
        System.out.println(main.searchByTitle("Hamlet"));
        System.out.println(main.lendBook(hamlet));
        System.out.println(main.returnBook(hamlet));
        System.out.println(main.removeBook(hamlet));
    }
}
