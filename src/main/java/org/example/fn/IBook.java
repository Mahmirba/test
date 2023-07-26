package org.example.fn;

public interface IBook {

    default String getName(){
        return "Book";
    }
}
