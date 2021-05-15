package Queue;

public class queueByLinkedListMain {
    public static void main(String[] args) {
        queueByLinkedList obj = new queueByLinkedList();
        obj.Enqueue(10);
        obj.Enqueue(20);
        obj.Enqueue(30);
        obj.Enqueue(40);
        obj.Dequeue();
        obj.Dequeue();
        obj.Display();
        obj.peekInqueue();



    }
}
