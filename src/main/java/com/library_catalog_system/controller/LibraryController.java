package com.library_catalog_system.controller;

import com.library_catalog_system.implementation.LibraryServiceImpl;
import com.library_catalog_system.model.Book;

import java.util.Collection;

/**
 * <p>
 * This class gets input from the user and returns the result to the user
 * </p>
 *
 * @author Petchimuthu Pitchiah
 * @version 1.0
 */

public class LibraryController {
    final LibraryServiceImpl serviceImpl = LibraryServiceImpl.getInstance();

    private static LibraryController controller;

    private LibraryController() {
    }

    /**
     * <p>
     * Method to get an instance of LibraryController
     * </p>
     *
     * @return controller returns instance of LibraryController
     */
    public static LibraryController getInstance() {

        if (controller == null) {
            controller = new LibraryController();
        }

        return controller;
    }

    /**
     * <p>
     * This method gets book which is to be added to the library
     * </p>
     * <p>
     * returns if it has done or not
     */
    public boolean addBook(final Book book) {
        return serviceImpl.addBook(book);
    }

    /**
     * <p>
     * This method gets book which is to be removed from the library
     * </p>
     * <p>
     * returns if it has done or not
     */
    public boolean removeBook(final Book book) {
        return serviceImpl.removeBook(book);
    }

    /**
     * <p>
     * This method gets name of an author which is to be searched from the library
     * </p>
     * <p>
     * returns collection of books if present
     */
    public Collection<String> searchBookByAuthor(final String name) {
        return serviceImpl.searchBookByAuthor(name);
    }

    /**
     * <p>
     * This method gets title of a book which is to be searched from the library
     * </p>
     * <p>
     * returns the book if present
     */
    public Collection<String> searchBookByTitle(final String title) {
        return serviceImpl.searchBookByTitle(title);
    }

    /**
     * <p>
     * This method gets title of a book which is to be lent from the library to the user
     * </p>
     * <p>
     * returns the count of the book
     */
    public int lendBook(final Book book) {
        return serviceImpl.lendBook(book);
    }

    /**
     * <p>
     * This method gets title of a book which is to be lent from the library to the user
     * </p>
     * <p>
     * returns the count of the book
     */
    public int returnBook(final Book book) {
        return serviceImpl.returnBook(book);
    }
}
