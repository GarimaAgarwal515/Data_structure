package LinkedList;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList obj = new LinkedList();
        obj.isEmpty();
        obj.InsertAtBeginning(20);
        obj.InsertAtBeginning(40);
        obj.InsertAtLast(50);
        obj.InsertAtLast(90);
        obj.Display();
        obj.DeleteFromBeginning();
        System.out.println("After deletion");
        obj.Display();
        obj.DeletionATLast();
        System.out.println("after deletion");
        obj.Display();


    }

    }

