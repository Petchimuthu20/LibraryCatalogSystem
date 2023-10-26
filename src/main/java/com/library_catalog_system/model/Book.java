package com.library_catalog_system.model;

/**
 * A model that holds the details of the Book
 *
 * @version 1.0
 * @author Petchimuthu Pitchiah
 */

public class Book {
    private String title;
    private Author author;

    private static int maxCount = 10;
    private static int ISBN=0;
    private int count;

    public void setTitle(String title){
        this.title=title;
    }

    public String getTitle(){
        return title;
    }

    public void setAuthor(Author author){
        this.author=author;
    }

    public Author getAuthor(){
        return author;
    }

    public void setISBN(){
        this.ISBN=++ISBN;
    }

    public int getISBN(){
        return ISBN;
    }

    public void setCount(int count){
        this.count=count;
    }

    public int getCount(){
        return count;
    }

    public int getMaxCount(){
        return maxCount;
    }
}
