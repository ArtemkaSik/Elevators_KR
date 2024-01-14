package org.example;

public class EmployeeElevator extends Elevator{
    private Type type = Type.СОТРУДНИКИ;

    private Status status;

    public EmployeeElevator(Status status){
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
