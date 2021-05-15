package Queue;

public class CircularQueueByArrayMain {
    public static void main(String[] args) {
        CircularQueueArrayImplementation obj = new CircularQueueArrayImplementation(5);
        obj.Enqueue(10);
        obj.Enqueue(20);
        obj.Enqueue(30);
        obj.Enqueue(40);
        obj.Enqueue(50);
        obj.Dequeue();
        obj.peekInqueue();

    }
}
