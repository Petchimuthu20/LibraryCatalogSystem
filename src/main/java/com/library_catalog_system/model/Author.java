package com.library_catalog_system.model;

/**
 * A model that holds the details of an Author
 *
 * @version 1.0
 * @author Petchimuthu Pitchiah
 */

public class Author {
    private String name;
    private String phoneNumber;

    public void setName(final String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void setPhoneNumber(final String phoneNumber){
        this.phoneNumber=phoneNumber;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }
}
