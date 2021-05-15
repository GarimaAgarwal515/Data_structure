package Queue;

public class queueByLinkedList {
    class node {
        int data;
        node next;

        public node(int data) {
            this.data=data;

             next = null;
        }
    }

    node front;
    node rear;

    public boolean IsEmpty() {
        if (front == null && rear == null) {
            return true;
        } else {
            return false;
        }
    }

    public void Enqueue(int data) {


        node newnode = new node(data);
        if (IsEmpty()) {
            front = rear = newnode;
            System.out.println(data+"inserted");
        } else {

            rear.next = newnode;
            rear = newnode;
            System.out.println(data + " inserted");
        }
    }


    public void Dequeue() {
        if (IsEmpty()) {
            return;
        } else {
            front = front.next;
        }
    }

    public void peekInqueue() {
        if (!IsEmpty()) {
            System.out.println("peek value is"+rear.data);
        }
    }

    public void Display() {
        node temp = front;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}





