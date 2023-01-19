/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package STACK;

/**
 *
 * @author Lenovo
 */
import java.util.*;
class Node{
       int data;
       Node link;
       Node(int data){
          this.data=data;
          link=null;
    }
}
public class LinkedListOperations {
    Node root;
    
    static Scanner sc = null;
    
    private void append(int data){
        Node temp = new Node(data);
        if(root==null){
            root=temp;
        }
        else{
            Node p;
            p=root;
            while(p.link!=null){
                p=p.link;
            }
            p.link=temp;
        }
    }
    private void middle(){
        Node slow = root;
        Node fast = root;
        while(fast!=null && fast.link!=null){
            slow = slow.link;
            fast=fast.link.link;
        }
        System.out.println(slow.data);
        
    }
    private void Reverse(){
        Node p =root;
        Node pre=null;
        Node ne=null;
        
        while(p!=null){
            ne=p.link;
            p.link=pre;
            pre=p;
            p=ne;
        } 
        root=pre;
    }
    private int length(){
        int  count=0;
        Node temp = root;
        while(temp!=null){
            count++;
            temp=temp.link;
        }
        return count;
    }   
    private void addBegin(int data){
        Node temp = new Node(data);
        temp.link=null;
        if(root==null){
            root=temp;
        }
        else{
            temp.link=root;
            root=temp;
        }
    }
    private void addAfter(int loc,int data){
        
        int len = length();
        if(loc>len){
            System.out.println("Location is passing length!!");
        }
        else{
            Node temp = new Node(data);
            temp.link=null;
            Node p =root;
            int i=1;
            while(i<loc){
                p=p.link;
                i++;
            }
            temp.link=p.link;
            p.link=temp;
        }
    }
    private void display(){
        Node temp=root;
        if(temp==null){
            System.out.println("Linked list is empty!!");
        }
        else{
            while(temp!=null){
                System.out.print(temp.data+"->");
                temp=temp.link;
            }
            System.out.println();
        }
    }
    private void delete(int loc){
        int len = length();
        Node temp ;
        if(loc>len){
            System.out.println("loc is greater then len");
        }
        else if(loc==1){
           temp=root;
           root=temp.link;
           temp.link=null;
            
        }
        else{
            Node p =root;
            Node q=root;
            int i=1;
            while(i<loc-1){
                p=p.link;
                i++;
            }
            q=p.link;
            p.link=q.link;
            q.link=null;
        }
    }
    private boolean checkLLContainsLoop(){
        Node p,q;
        p=root;
        q=root;
        do{
            p=p.link;
            q=q.link;
            q=q!=null?q:null;
        }while(p!=null && q!=null);
        if(p==q){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        LinkedListOperations list = new LinkedListOperations();
        sc = new Scanner(System.in);
        while(true){
            System.out.println("1.append\n2.display\n3.length\n4.addBegin\n5.addAfter\n6.delete\n7.checkloop\n8.Reverse\n9.exit\n");

            System.out.println("enter your choice");
            int ch = sc.nextInt();

           switch(ch){
               case 1:
                  System.out.println("enter the element to insert at end!!");
                  int n = sc.nextInt();
                  list.append(n);
                  break;
            
                 case 2:
                    list.display();
                    break;

                case 3:
                    int l;
                    l= list.length();
                    System.out.println(l);
                    break;
                case 4:
                   System.out.println("enter the element to insert at begain!!");
                   int n1 = sc.nextInt();
                   list.addBegin(n1);
                   break;
                case 5:
                    System.out.println("enter the element to insert at position!!");
                    int n2 = sc.nextInt();
                    System.out.println("enter the location where to insert element!!");
                    int loc = sc.nextInt();
                    list.addAfter(loc,n2);
                    break;
                case 6:
                    System.out.println("enter the location where to insert element!!");
                    int loc1 = sc.nextInt();
                    list.delete(loc1);
                case 7:
                    System.out.println(list.checkLLContainsLoop());
                    break;
                case 8:
                    list.Reverse();
                    break;
                case 9:
                   System.exit(1);
                   break;
                   
                default:
                   System.out.println("invalid choice");
                   break;
            }
        }
    }
}
