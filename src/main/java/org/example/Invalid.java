package org.example;

class InvalidCallException extends Exception {
    public InvalidCallException(){
        super("All elevators are busy");
    }
}
