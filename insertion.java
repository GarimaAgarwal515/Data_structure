package LinkedList;
//implementation of singly linkedlist

class LinkedList {
    class node {
        int data;
        node next;

        public node(int data) {
            this.data = data;
            next = null;
        }
    }

    node head;

    public boolean isEmpty() {
        if (head == null) {
            return true;
        } else {
            return false;
        }
    }

    public void InsertAtBeginning(int data) {
        node newnode = new node(data);
        newnode.next = head;
        head = newnode;


    }
    public void DeleteFromBeginning(){
        if (isEmpty()) {
            return;
        }
            else {
                head=head.next;

            }

        }
        public void InsertAtLast(int data){
        node newnode = new node(data);
        if(isEmpty()){
            head = newnode;
        }
        else {
            node temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next=newnode;
        }
        }
        public void DeletionATLast(){
        node temp = head;
        node pre = null;
        while(temp.next!=null){
            pre = temp;
            temp = temp.next;
        }
        pre.next=null;

        }
        public void Display(){
        node temp = head;
        while(temp!=null){
            System.out.println("data "+temp.data);
            temp=temp.next;
        }
        }

    }









