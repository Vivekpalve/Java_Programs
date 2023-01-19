/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_programs.array_programs;

/**
 *
 * @author Lenovo
 */
public class Reverse {
    
    static void reverseArray(int[] A){
        
        int i=0;
        int j=A.length-1;
        
        while(i<j){
            int t=A[i];
            A[i]=A[j];
            A[j]=t;
            i++;j--;
        }
        for(int x=0;x<A.length;x++){
            System.out.print(A[x]+" ");
        }
    }
    public static void main(String args[]){
        int[] A = {1,2,3,4,5,6,7,8,9,10};
        
        reverseArray(A);
    }
}
