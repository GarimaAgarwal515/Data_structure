package Queue;

public class queueByArray {
    int arr[];
    int front;
    int rear;

    public queueByArray(int size) {
        arr = new int[size];
        front = rear = -1;//beginning or top
    }

    public Boolean isEmpty() {
        if (front == -1 && rear == -1) {
            return true;
        } else {
            return false;
        }
    }

    public Boolean isFull() {
        if (rear == arr.length - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("queue is full");
        } else if (isEmpty()) {
            front = 0;
            rear++;
            arr[rear] = data;
            System.out.println(data + " is inserted in queue");
        } else {
            rear++;
            arr[rear] = data;
            System.out.println(data + " is inserted in queue");
        }
    }

    public void Dequeue() {
        if (isEmpty()) {
            System.out.println("queue is empty");
        } else {
            arr[front] = 0;
            front++;
        }
        if (arr[front] == 0 || arr[rear] == 0) {
            arr[front] = arr[rear] = -1;
        }
    }

    public void peekinqueue() {
        if (isEmpty()) {
            System.out.println("queue is empty");
        } else {
            System.out.println(arr[rear]);
        }
    }

    public void DeleteQueue() {
        arr = null;
    }

    public void Display() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}






