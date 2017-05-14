package com.example.android.booklisting;

/**
 * Created by berso on 5/14/17.
 */

public class Book {

    //Book varibles
    private String autor;
    private String name;
    private Double cost;
    private String currency;

    //Book constructor
    public void Book(String autor,String name,Double cost,String currency){
        this.autor    = autor;
        this.name     = name;
        this.cost     = cost;
        this.currency = currency;
    }

    public String getAutor(){
        return autor;
    }

    public String getName(){
        return name;
    }

    public Double getCost(){
        return cost;
    }

    public String getCurrency(){
        return currency;
    }
}
