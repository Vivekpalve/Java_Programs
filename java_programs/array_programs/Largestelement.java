/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_programs.array_programs;

/**
 *
 * @author Lenovo
 */
public class Largestelement {
    
    static void largenumber(int[] A){
        int max=Integer.MIN_VALUE;
        int min= Integer.MAX_VALUE;
        
        for(int i=0;i<A.length;i++){
            if(A[i]>max){
                max=A[i];
            }
            if(A[i]<min){
                min=A[i];
            }
        }
        System.out.println("min :"+min+"\nmax :"+max);
    }
    public static void main(String args[]){
        int[] A = {32,2,11,4,66,4,77,99};
        
        largenumber(A);
    }
}
