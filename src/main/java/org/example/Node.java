package org.example;

public class Node {
    public ElevatorBasic elevator;
    public Node next;

    public Node(ElevatorBasic elevator) {
        this.next = null;
        this.elevator = elevator;
    }
}
