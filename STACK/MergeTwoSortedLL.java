/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package STACK;
class Tiaa{
     Node sort(Node l1,Node l2){
        Node l3;
        Node last;
        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }
        if(l1.data<l2.data){
            l3=last=l1;
            l1=l1.link;
            last.link=null;
        }
        else{
            l3=last=l2;
            l2=l2.link;
            last.link=null;
        }
        while(l1!=null && l2!=null){
            if(l1.data<l2.data){
                last.link=l1;
                last=l1;
                l1=l1.link;
                last.link=null;
            }
            else{
                last.link=l2;
                last=l2;
                l2=l2.link;
                last.link=null;
            }
        }
        if(l1!=null){
            last.link=l1;
        }
        if(l2!=null){
            last.link=l2;
        }
        return l3;
          
    }
}
class Node{
    int data;
    Node link;
    Node(int data){
        this.data=data;
        link=null;
    }
}
public class MergeTwoSortedLL {
    Node root;
    
    MergeTwoSortedLL(){
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
    
    private Node sort(Node l1,Node l2){
        Node l3;
        Node last;
        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }
        if(l1.data<l2.data){
            l3=last=l1;
            l1=l1.link;
            last.link=null;
        }
        else{
            l3=last=l2;
            l2=l2.link;
            last.link=null;
        }
        while(l1!=null && l2!=null){
            if(l1.data<l2.data){
                last.link=l1;
                last=l1;
                l1=l1.link;
                last.link=null;
            }
            else{
                last.link=l2;
                last=l2;
                l2=l2.link;
                last.link=null;
            }
        }
        if(l1!=null){
            last.link=l1;
        }
        if(l2!=null){
            last.link=l2;
        }
        return l3;
          
    }
    void printList(){
        Node temp = root;
        while (temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.link;
        } 
        System.out.println();
    }
    public static void main(String args[]){
        MergeTwoSortedLL l1 = new MergeTwoSortedLL();
        MergeTwoSortedLL l2 = new MergeTwoSortedLL();
        
        l1.append(1);
        l1.append(2);
        l1.append(5);
        l1.append(8);
        l1.append(9);
        l2.append(1);
        l2.append(3);
        l2.append(7);
        l2.append(10);
        l2.append(11);
        
        l2.root = new Tiaa().sort(l1.root, l2.root);
//        l1.root = new MergeTwoSortedLL().sort(l1.root, l2.root);
//        l1.printList();
        l2.printList();
    }
}
