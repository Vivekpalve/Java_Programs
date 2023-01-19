/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package STACK;

class Node {
    int data;
    Node link;
    Node(int data){
        this.data=data;
        link=null;
    }
}
public class ReverseLL {
    Node root;
    ReverseLL(){
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
    private Node reverse(){
        Node p=root;
        Node q=null;
        Node r=null;
        
        while(p!=null){
            r=q;
            q=p;
            p=p.link;
            q.link=r;
        }
        return q;
    }
    public static void main(String args[]){
        ReverseLL l = new ReverseLL();
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
        
        Node t = l.reverse();
        Node tt =t;
        while(tt.link!=null){
            System.out.print(tt.data+" ");
            tt=tt.link;
        }
    }
}
