package org.example;

public class ChetElevator extends Elevator {
    private Type type = Type.ЧЕТНЫЙ;

    private Status status;

    public ChetElevator(Status status) {
        this.status = status;
    }

}
