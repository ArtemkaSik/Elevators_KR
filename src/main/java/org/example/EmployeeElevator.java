package org.example;

public class EmployeeElevator extends Elevator{
    private Type type = Type.СОТРУДНИКИ;

    private Status status;

    public EmployeeElevator(Status status){
        this.status = status;
    }

}
