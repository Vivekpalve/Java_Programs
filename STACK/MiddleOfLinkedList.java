package STACK;
class Node{
    int data;
    Node link;
    Node(int data){
        this.data=data;
        link=null;
    }
    
}
public class MiddleOfLinkedList {
    Node root;
    private void append(int data){
        Node temp = new Node(data);
        temp.link=null;
        
        if(root==null){
            root=temp;
        }
        else{
            Node p=root;
            while(p.link!=null){
                p=p.link;
            }
            p.link=temp;
        }
    }
    private int Middle(){
        Node p=root,q=root;
        
        while(q!=null && q.link!=null){
            p=p.link;
            q=q.link.link;
        }
        return p.data;
    }
    public static void main(String args[]){
        MiddleOfLinkedList l = new MiddleOfLinkedList ();
        l.append(10);
        l.append(20);
        l.append(30);
        l.append(40);
        l.append(50);
        l.append(60);
        l.append(70);
        l.append(80);
        l.append(90);
        l.append(100);
        
        int t = l.Middle();
        System.out.println(t);
        
    }
}
