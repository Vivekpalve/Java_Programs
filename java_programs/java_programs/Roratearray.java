/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_programs;

/**
 *
 * @author Lenovo
 */
public class Roratearray {
    
    static void reverse(int A[],int st,int end){
        while(st<end){
            int t= A[st];
            A[st]=A[end];
            A[end]=t;
            st++;
            end--;
        }
    }
    static void rotateArrayleft(int A[],int k){
        reverse(A,0,A.length-1);
        reverse(A,0,A.length-k-1);
        reverse(A,A.length-k,A.length-1);
        
        for(int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
        System.out.println();
    }
    
    static void rotateArrayright(int A[],int k){
        reverse(A,0,A.length-1);
        reverse(A,0,k-1);
        reverse(A,k,A.length-1);
        
        
        for(int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
    }
    public static void main(String args[]){
        int A[]={1 ,2 ,3 ,4 ,5};
        int k=2;
        rotateArrayleft(A,k);
        int A1[]={1 ,2 ,3 ,4 ,5};
        int k2=2;
        rotateArrayright(A1,k2);
    }
}
