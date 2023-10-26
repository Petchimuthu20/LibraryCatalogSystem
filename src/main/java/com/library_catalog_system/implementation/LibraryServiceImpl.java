package com.library_catalog_system.implementation;

import com.library_catalog_system.model.Book;
import com.library_catalog_system.service.LibraryService;

import java.util.ArrayList;
import java.util.Collection;

/**
 * <p>
 * The LibraryService  manages a library's catalog
 * It handles operations like adding, removing and searching for books
 * </p>
 *
 * @version 1.0
 * @author Petchimuthu Pitchiah
 */
public class LibraryServiceImpl implements LibraryService {

    final private Collection<Book> books = new ArrayList<>();

    private static LibraryServiceImpl service;

    private LibraryServiceImpl() {
    }

    /**
     * <p>
     * Method to get an instance of LibraryServiceImpl
     * </p>
     *
     * @return service returns instance of LibraryController
     */
    public static LibraryServiceImpl getInstance() {

        if (service == null) {
            service = new LibraryServiceImpl();
        }

        return service;
    }


    /**
     * {@inheritDoc}
     * @param book represents the book to be added
     *
     * @return either true if added or false if not
     */
    @Override
    public boolean addBook(final Book book) {
        return books.add(book);
    }


    /**
     * {@inheritDoc}
     * @param book represents the book to be removed from the library
     *
     * @return either true if removed or false if not
     */
    @Override
    public boolean removeBook(final Book book) {
        return books.remove(book);
    }


    /**
     * {@inheritDoc}
     * @param book represents the book to be lent from the library
     *
     * @return remaining count of the specific book or 0 if there is no stock
     */
    @Override
    public int lendBook(final Book book) {

        if (books.contains(book) && book.getCount() > 0) {
            book.setCount(book.getCount() - 1);

            return book.getCount();
        } else {

            return 0;
        }
    }


    /**
     * {@inheritDoc}
     * @param book represents the book to be returned to the library
     *
     * @return  count of the specific book after adding the returned book to the library
     */
    @Override
    public int returnBook(final Book book) {
        int count = book.getCount();

        if (book.getMaxCount() > count) {
            book.setCount(count + 1);

            return ++count;
        }
        return 0;
    }

    /**
     * {@inheritDoc}
     * @param name represents the name of the author
     *
     * @return the collection of book of a specific author
     */
    @Override
    public Collection<String> searchBookByAuthor(String name) {
        final Collection<String> booksOfAuthor = new ArrayList<>();

        for (Book book : books) {

            if (book.getAuthor().getName().equals(name)) {
                booksOfAuthor.add(book.getTitle());
            }
        }

        return booksOfAuthor;
    }

    /**
     * {@inheritDoc}
     * @param title represents the title of the book
     *
     * @return the collection of book of a specific title
     */
    @Override
    public Collection<String> searchBookByTitle(String title) {
        final Collection<String> booksOfTitle = new ArrayList<>();

        for (Book book : books) {
            final String bookTitle = book.getTitle();

            if (bookTitle.equals(title)) {
                booksOfTitle.add(bookTitle);
            }
        }

        return booksOfTitle;
    }

}
