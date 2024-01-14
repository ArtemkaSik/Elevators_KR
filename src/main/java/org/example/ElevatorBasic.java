package org.example;
//Универсальный лифт(используется для определения свободного лифта)
public class ElevatorBasic extends Elevator {
    private Status status;
    private Type type;
    public ElevatorBasic(Status status, Type type){
        this.status = status;
        this.type = type;
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
