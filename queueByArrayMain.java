package Queue;

public class queueByArrayMain {
    public static void main(String[] args) {
        queueByArray obj = new queueByArray(5);
        obj.isEmpty();
        obj.enqueue(10);
        obj.enqueue(20);
        obj.enqueue(30);
        obj.enqueue(40);
        obj.enqueue(50);
        obj.Dequeue();
        obj.Display();
        obj.Dequeue();
        obj.Display();
        obj.peekinqueue();

    }
}
