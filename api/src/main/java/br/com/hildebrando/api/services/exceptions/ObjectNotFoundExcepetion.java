package br.com.hildebrando.api.services.exceptions;

public class ObjectNotFoundExcepetion extends RuntimeException {
     public ObjectNotFoundExcepetion(String message) {
        super(message);
    }
}
