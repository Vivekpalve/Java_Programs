/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package STACK;

import java.util.*;
public class QueueOperations {
    static Scanner sc = null;
    int front;
    int rear;
    int[] arr;
    int size;
    QueueOperations(int size){
        this.size=size;
        arr = new int[size];
        front=0;
        rear=0;
        
    }
    private void enqueue(int x){
        if(isFull()){
            System.out.println("Queue is Full!!!");
            System.exit(0);
        }
        else{
            
            arr[rear]=x;
            rear++;
        }
    }
    
    private int dequeue(){
        int x =-1;
        if(isEmpty()){
            System.out.println("Queue is Empty!!");
            System.exit(0);
        }
        else{
            x=arr[front];
            for(int i=0;i<rear-1;i++){
                arr[i]=arr[i+1];
            }
            rear--;
        }
        return x;
    }
    private void printQueue(){
        for(int i=0;i<rear;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    private boolean isFull(){
        if(size==rear){
            return true;
        }
        return false;
    }
    private boolean isEmpty(){
        if(front==rear){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        sc = new Scanner(System.in);
        System.out.println("enter the size of Queue!!");
        int Queuesize = sc.nextInt();
        QueueOperations s = new QueueOperations(Queuesize);
        
        
        while(true){
            System.out.println("1.Enqueue\n2.Dequeue\n3.IsQueueFull\n4.IsQueueEmpty\n5.PrintQueue");
            System.out.println("enter the choice");
            int ch = sc.nextInt();
            switch(ch){
                case 1:
                    System.out.println("enter the element you want to push");
                    int n = sc.nextInt();
                    s.enqueue(n);
                    break;
                case 2 :
                    System.out.println("Element after pop :"+s.dequeue());
                    break;
                case 3 :
                    if(s.isFull()){
                        System.out.println("stack is full");
                    }
                    break;
                case 4:
                    if(s.isEmpty()){
                        System.out.println("stack is empty");
                    }
                    break;
                case 5:
                    s.printQueue();
                    break;
                default:
                    System.out.println("invalid input");
                    break;
            }   
        }
    }
}
