package STACK;
class Node{
    int data;
    Node link;
    Node(int data){
        this.data=data;
        link=null;
    }
}
public class PalindromeLL {
    Node root;
    PalindromeLL(){
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
    private boolean palindrome(Node root){
        //middle
        Node slow=root,fast=root;
        while(fast!=null && fast.link!=null){
            slow=slow.link;
            fast=fast.link.link;
        }
        Node q=null;
        Node r=null;
        System.out.println(slow.data);
        while(slow!=null){
            r=q;
            q=slow;
            slow=slow.link;
            q.link=r;
            
        }
        System.out.println(q.data);
        Node t =q;
        while(t!=null){
            System.out.print(t.data+" ");
            t=t.link;
        }
        while(root!=null && q!=null){
            if(q.data!=root.data){
                break;
            }
            q=q.link;
            root=root.link;
        }
        return root==null || q==null;
    }
    public static void main(String args[]){
        PalindromeLL l = new PalindromeLL();
        l.append(10);
        l.append(90);
        l.append(30);
        l.append(40);
        l.append(50);
        l.append(40);
        l.append(30);
        l.append(90);
        l.append(10);
        
        boolean p = l.palindrome(l.root);
        System.out.println(p);
    }
}

