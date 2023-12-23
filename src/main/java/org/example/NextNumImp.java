package org.example;

public class NextNumImp implements ElevatorFree{
    private Node head = null;

    public void add(boolean isFree) {
        Node root = new Node(isFree);
        if (head == null) {
            head = root;
            head.next = head; // Закольцовываем список
        } else {
            Node current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = root;
            root.next = head; // Закольцовываем список
        }
    }

    @Override
    public ElevatorFree free() {
        Node current = head;
        while (current.next != head) {
            if (current.isFree) {
                return new NextNumImp(); // Возвращаем новый экземпляр свободного лифта
            }
            current = current.next;
        }
        if (current.isFree) {
            return new NextNumImp(); // Возвращаем новый экземпляр свободного лифта
        }
        return null; // Если свободного лифта не найдено, возвращаем null
    }
}