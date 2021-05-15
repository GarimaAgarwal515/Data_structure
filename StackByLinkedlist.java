package LinkedListRepresenatation;

public class StackByLinkedlist {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }
        Node TopOfStack;
        public boolean isEmpty(){
            if(TopOfStack==null) {
                return true;
            }
                else {
                return false;
            }

                }
                public void push(int data){
            Node newnode = new Node(data);
            newnode.next=TopOfStack;
            TopOfStack=newnode;


            }
            public void  pop(){
            if(isEmpty()) {
                System.out.println("stack is empty");
            }
            else {
                System.out.println(TopOfStack.data);
                TopOfStack=TopOfStack.next;


            }

        }
        public void peek(){
            System.out.println(TopOfStack.data);
        }
        public void Display(){
            Node temp = TopOfStack;
            while(temp!=null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }

    }

