package org.example;

public class ChetElevator extends Elevator {
    private Type type = Type.ЧЕТНЫЙ;

    private Status status;

    public ChetElevator(Status status) {
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
