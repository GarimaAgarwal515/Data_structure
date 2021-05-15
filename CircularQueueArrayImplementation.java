package Queue;



public class CircularQueueArrayImplementation {
    int arr[];
    int rear;
    int front;

    public CircularQueueArrayImplementation(int Size) {
        arr = new int[Size];
        front = rear = -1;


    }
    public boolean IsEmpty(){
        if(front==-1 && rear==-1){
            return true;}
        else {
            return false;
        }

        }
        public boolean isFull(){
        if(rear+1==front){
            return true;}
            else if(front==0 && rear+1==arr.length){
                return true;}
                else{
                return false;
            }}
            public void Enqueue(int data){
        if(isFull()) {
            System.out.println("queue is full");
        }
         else if(IsEmpty()) {
             front=0;
             rear=0;
            arr[rear]  = data;
            System.out.println(data+" is inserted");
        }
         else if(rear+1==arr.length) {
            rear = 0;
        }
        else {
            rear++;
            arr[rear] = data;
            System.out.println(data+" is inserted");
        }

        }
        public void Dequeue(){
        if(IsEmpty()) {
            System.out.println("queue is Empty");
        }

        else {
            System.out.println(arr[front]);
            if(front==rear){

                front=rear-1;
            }
            else if(front+1==arr.length) {
                front = 0;
            }
            else {
                front++;
            }
        }



        }
        public void peekInqueue(){
        if(!IsEmpty()){
            System.out.println(arr[rear]);
        }
        }
        public void Display(){
        for(int i =0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
        }
        }




