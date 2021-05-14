package ArrayRepresentation;

public class StackArrayRepresentation {
    int arr[];
    int topOfStack;

    public StackArrayRepresentation(int size) {
        arr = new int[size];
        topOfStack = -1;
    }

    public boolean isFull() {
        if (topOfStack == arr.length - 1)
        return true;
        else
            return false;
    }

    public boolean isEmpty() {
        if (topOfStack == -1)
        return true;
        else
            return false;


    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("overflow");
        } else {
            topOfStack++;
            arr[topOfStack] = data;
            System.out.println(data+" is pushed");
        }
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("underflow");
        } else {
            int x = arr[topOfStack--];
            System.out.println("in x"+x);


        }
    }
    public void peek(){
        if(!isEmpty()) {
            System.out.println(arr[topOfStack]);
        }
        else {
            System.out.println("empty");
        }
    }
    public void DeleteStack(){
        arr=null;
        topOfStack=-1;
    }

    public void Display() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
