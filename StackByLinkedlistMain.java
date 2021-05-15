package LinkedListRepresenatation;

public class StackByLinkedlistMain {
    public static void main(String[] args) {
        StackByLinkedlist obj = new StackByLinkedlist();

        obj.push(50);
        obj.push(20);
        obj.push(70);
        obj.push(80);

        obj.Display();
        obj.pop();

        obj.pop();
        System.out.println("elements left in the stack");

        obj.Display();
        obj.peek();





    }
}
