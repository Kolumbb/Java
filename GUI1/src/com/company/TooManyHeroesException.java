package com.company;

public class TooManyHeroesException extends Exception{
    public TooManyHeroesException() {

    }

    @Override
    public String getMessage() {
        return "Dodałeś zbyt dużo bohaterów!";
    }
}
