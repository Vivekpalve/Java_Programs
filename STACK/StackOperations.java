package STACK;
import java.util.*;
public class StackOperations {
    static Scanner sc = null;
    int size;
    int top;
    int[] arr ;
    StackOperations(int size){
        this.size=size;
        top=-1;
        arr = new int[size];
    }
    private void push(int x){
        if(isFull()){
            System.out.println("Stack is full!!!");
            System.exit(0);
        }
        else{
            System.out.println("Inserting :"+x);
            arr[++top]=x;
        }
    }
    private int pop(){
        int x =-1;
        if(isEmpty()){
            System.out.println("Stack is empty!!!!");
        }
        else{
            x=arr[top--];
        }
        return x;
    }
    private void printStack(){
        for(int i=0;i<=top;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    private boolean isFull(){
        if(top==size-1){
            return true;
        }
        return false;
    }
    private boolean isEmpty(){
        if(top==-1){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        sc = new Scanner(System.in);
        System.out.println("enter the size of stack");
        int stacksize = sc.nextInt();
        StackOperations s = new StackOperations(stacksize);
        
        
        while(true){
            System.out.println("1.push\n2.pop\n3.IsStackFull\n4.IsStackEmpty\n5.PrintStack");
            System.out.println("enter the choice");
            int ch = sc.nextInt();
            switch(ch){
                case 1:
                    System.out.println("enter the element you want to push");
                    int n = sc.nextInt();
                    s.push(n);
                    break;
                case 2 :
                    System.out.println("Element after pop :"+s.pop());
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
                    s.printStack();
                    break;
                default:
                    System.out.println("invalid input");
                    break;
            }   
        }
    }
}
