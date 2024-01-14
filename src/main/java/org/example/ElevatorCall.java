package org.example;

public enum ElevatorCall implements Call{
    НЧЕТНЫЙ{
        @Override
        public ChetElevator callToEvenFloor() {return new ChetElevator(Status.СВОБОДЕН);}

        @Override
        public NeChetElevator callToOddFloor() {
            return null;
        }

        @Override
        public EmployeeElevator callToEmployeeFloor() {
            return null;
        }

    },

    ННЕЧЕТНЫЙ{
        @Override
        public ChetElevator callToEvenFloor() {
            return null;
        }

        @Override
        public NeChetElevator callToOddFloor() {return new NeChetElevator(Status.СВОБОДЕН);}

        @Override
        public EmployeeElevator callToEmployeeFloor() {
            return null;
        }

    },

    НСОТРУДНИК{
        @Override
        public ChetElevator callToEvenFloor() {
            return null;
        }

        @Override
        public NeChetElevator callToOddFloor() {
            return null;
        }

        @Override
        public EmployeeElevator callToEmployeeFloor() {return new EmployeeElevator(Status.СВОБОДЕН);}
    }
}
