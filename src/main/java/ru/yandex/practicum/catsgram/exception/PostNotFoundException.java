package ru.yandex.practicum.catsgram.exception;

public class PostNotFoundException extends RuntimeException{
    public PostNotFoundException(String s){
        super(s);
    }
}
