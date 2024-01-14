package org.example;

public class NextNumImp implements ElevatorFree{
    private Node head;

    public NextNumImp() {
        head = null;
    }

    // Метод добавления нового лифта в список
    public void add(ElevatorBasic elevator) {
        if (head == null) {
            head = new Node(elevator);
            head.next = head;
        } else {
            Node newNode = new Node(elevator);
            Node temp = head;

            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
        }
    }

    // Метод для определения свободного лифта
    public ElevatorBasic free() {
        if (head == null) {
            return null;
        }

        Node temp = head;
        while (temp.next != head && temp.elevator.getStatus() == Status.ЗАНЯТ) {
            temp = temp.next;
        }

        if (temp.elevator.getStatus() == Status.СВОБОДЕН) {
            return temp.elevator;
        }

        return null;
    }
}