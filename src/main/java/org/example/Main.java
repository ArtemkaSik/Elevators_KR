package org.example;

public class Main {
    public static void main(String[] args) {

        ElevatorBasic el1 = new ElevatorBasic(Status.ЗАНЯТ,Type.НЕЧЕТНЫЙ);
        ElevatorBasic el2 = new ElevatorBasic(Status.СВОБОДЕН,Type.НЕЧЕТНЫЙ);
        ElevatorBasic el3 = new ElevatorBasic(Status.ЗАНЯТ,Type.НЕЧЕТНЫЙ);
        ElevatorBasic el4 = new ElevatorBasic(Status.СВОБОДЕН,Type.НЕЧЕТНЫЙ);

        NextNumImp elfree = new NextNumImp();
        elfree.add(el1);
        elfree.add(el2);
        elfree.add(el3);
        elfree.add(el4);

        ElevatorBasic elevatorFree = elfree.free();

        try {
            registerExcept(elevatorFree);
        } catch (InvalidCallException e) {
            System.out.println(e.getMessage());
        }

        ElevatorCall call = ElevatorCall.НЧЕТНЫЙ;
        ChetElevator chetElevator = call.callToEvenFloor();

        call = ElevatorCall.ННЕЧЕТНЫЙ;
        NeChetElevator neChetElevator = call.callToOddFloor();

        call = ElevatorCall.НСОТРУДНИК;
        EmployeeElevator employeeElevator = call.callToEmployeeFloor();


        NeChetElevator neelev = new NeChetElevator(Status.СВОБОДЕН);
        NeChetElevator neelev1 = new NeChetElevator(Status.ЗАНЯТ);
        NeChetElevator neelev2 = new NeChetElevator(Status.СВОБОДЕН);

        ChetElevator chelev = new ChetElevator(Status.СВОБОДЕН);
        ChetElevator chelev1 = new ChetElevator(Status.СВОБОДЕН);
        ChetElevator chelev2 = new ChetElevator(Status.ЗАНЯТ);

        EmployeeElevator empel = new EmployeeElevator(Status.СВОБОДЕН);

    }

    public static void registerExcept(ElevatorBasic elevatorFree) throws InvalidCallException{
        if (elevatorFree == null) {
            throw new InvalidCallException();
        }

        System.out.println("There are free elevators !");
    }

}