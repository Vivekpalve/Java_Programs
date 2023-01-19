package STACK;


class Node{
    int data;
    Node link;
    Node(int d){
        data=d;
        link=null;
    }
}

public class QueueUsingLL {
    Node front;
    Node rear;
    QueueUsingLL(){
        rear=null;
        front=null;
    }
    private void enqueue(int data){
        Node t = new Node(data);
        t.link=null;
        
        if(t==null){
            System.out.println("Stack is empty");
        }
        else if(rear==null){
            rear=t;
            front=rear;
        }
        else{
            rear.link=t;
            rear=t;
        }
    }
    private int dequeue(){
        int x =-1;
        Node p =front;
        if(front==null){
            System.out.println("queue is empty");
        }
        else{
            x=p.data;
            front=front.link;
            p.link=null;
        }
        return x;
    }
    private void display(){
        Node p =front;
        while(p!=null){
            System.out.print(p.data+" ");
            p=p.link;
        }
        System.out.println();
    }
    public static void main(String args[]){
        QueueUsingLL l = new QueueUsingLL();
        l.enqueue(10);
        l.enqueue(20);
        l.enqueue(30);
        l.enqueue(40);
        l.enqueue(50);
        l.enqueue(60);
        l.enqueue(70);
        l.enqueue(80);
        l.enqueue(90);
        l.display();
        int t=l.dequeue();
        System.out.println(t);
        l.display();
    }
}
