package com.library_catalog_system.service;

import com.library_catalog_system.model.Book;

import java.util.Collection;

/**
 * <p>
 * The LibraryService interface manages a library's catalog
 * It handles operations like adding, removing and searching for books
 * </p>
 *
 * @version 1.0
 * @author Petchimuthu Pitchiah
 */
public interface LibraryService {

    /**
     * <p>
     * Adds book to the library
     * </p>
     * @param book represents the book to be added
     *
     * @return  either true if added or false if not
     */
    boolean addBook(final Book book);

    /**
     * <p>
     * Removes book from the library
     * </p>
     * @param book represents the {@link Book} to be removed from the library
     *
     * @return either true if removed or false if not
     */
    boolean removeBook(final Book book);

    /**
     * <p>
     * Lends book from the library
     * </p>
     * @param book represents the book to be lent from the library
     *
     * @return remaining count of the specific book or 0 if there is no stock
     */
    int lendBook(final Book book);

    /**
     * Returns book to the book
     * @param book represents the book to be returned to the library
     *
     * @return count of the specific book after adding the returned book to the library
     */
    int returnBook(final Book book);

    /**
     * Attempts to search for the book of a specific author in the library
     *
     * @param name represents the name of the author
     * @return the collection of book of a specific author
     */
    Collection<String> searchBookByAuthor(final String name);

    /**
     * Attempts to search for the book of a specific title in the library
     *
     * @param title represents the title of the book
     * @return the collection of book of a specific title
     */
    Collection<String> searchBookByTitle(final String title);
}
