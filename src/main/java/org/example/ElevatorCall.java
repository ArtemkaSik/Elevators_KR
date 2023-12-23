package org.example;

public class ElevatorCall implements Call{
    public ChetElevator callToEvenFloor() {
        // Логика вызова лифта на четный этаж
        return new ChetElevator(Status.СВОБОДЕН);
    }

    public NeChetElevator callToOddFloor() {
        // Логика вызова лифта на нечетный этаж
        return new NeChetElevator(Status.СВОБОДЕН);
    }

    @Override
    public EmployeeElevator callToEmployeeFloor() {
        // Логика вызова лифта для сотрудника
        return new EmployeeElevator(Status.СВОБОДЕН);
    }

}
