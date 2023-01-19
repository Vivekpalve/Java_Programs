
package STACK;
class Node{
    int data;
    Node link;
    Node(int data){
        this.data=data;
        link=null;
    }
}
public class DeleteMiddleOfLL {
    Node root;
    DeleteMiddleOfLL(){
        root=null;
    }
    private void append(int data){
        Node temp = new Node(data);
        temp.link=null;
        if(root==null){
            root=temp;
        }
        else{
            Node p =root;
            while(p.link!=null){
                p=p.link;
            }
            p.link=temp;
        }
    }
    private Node DeleteMiddle(){
        Node p = root;
        Node q = root;
        Node r=null;
        while(p!=null && p.link!=null){
            r=q;
            p=p.link.link;
            q=q.link;
        }
        System.out.println(r.data+"mid-: "+q.data);
        r.link=q.link;
        q.link=null;
        return root;
    }
    public static void main(String args[]){
        DeleteMiddleOfLL l = new DeleteMiddleOfLL();
        l.append(10);
        l.append(20);
        l.append(30);
        l.append(40);
//        l.append(50);
//        l.append(60);
//        l.append(70);
//        l.append(80);
//        l.append(90);
//        l.append(100);
//        l.append(110);
        Node t1 =l.root;
        while(t1!=null){
            System.out.print(t1.data+" ");
            t1=t1.link;
        }
        System.out.println();
        Node t = l.DeleteMiddle();
        Node tt=t;
        while(tt!=null){
            System.out.print(tt.data+" ");
            tt=tt.link;
        }
    }
}
