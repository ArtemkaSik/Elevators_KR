package org.example;

public abstract class Elevator {
    protected Status status;
    protected Type type;

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
