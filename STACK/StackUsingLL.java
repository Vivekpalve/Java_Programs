
package STACK;

/**
 *
 * @author Lenovo
 */
class Node{
    int data;
    Node link;
    Node(int data){
        this.data=data;
        link=null;
    }
}
public class StackUsingLL {
    Node top;
    StackUsingLL(){
        top=null;
    }
    
    private void push(int data){
        Node temp = new Node(data);
        temp.link=null;
        if(temp==null){
            System.out.print("stack is full");
        }
        else{
           temp.data=data;
           temp.link=top;
           top=temp;
        }
    }
    private int pop(){
        int x=-1;
        Node p;
        if(top==null){
            System.out.println("stack is empty");
        }
        else{
            p=top;
            top=top.link;
            x=p.data;
            p.link=null;
        }
        return x;
    }
    private void display(){
        Node p1;
        p1=top;
        while(p1!=null){
            System.out.print(p1.data+" ");
            p1=p1.link;
        }
        System.out.println();
    }
    public static void main(String args[]){
        StackUsingLL l = new StackUsingLL();
        l.push(10);
        l.push(20);
        l.push(30);
        l.push(40);
        l.push(50);
        l.push(60);
        l.push(70);
        l.display();
        l.pop();
        l.display();
    }
}
