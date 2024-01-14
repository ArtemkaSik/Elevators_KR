package org.example;

public class NeChetElevator extends Elevator {
    private Type type = Type.НЕЧЕТНЫЙ; //Параметр по умолчанию

    private Status status;

    public NeChetElevator(Status status){
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus() {
        this.status = status;
    }

    public Type getType() {
        return type;
    }

    public void setType() {
        this.type = type;
    }
}
