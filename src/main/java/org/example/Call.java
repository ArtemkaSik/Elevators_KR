package org.example;

public interface Call {
    ChetElevator callToEvenFloor(); // Вызов лифта на четный этаж
    NeChetElevator callToOddFloor();      // Вызов лифта на нечетный этаж
    EmployeeElevator callToEmployeeFloor(); // Вызов лифта для сотрудника
}
