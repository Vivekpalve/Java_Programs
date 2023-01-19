/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_programs.array_programs;

/**
 *
 * @author Lenovo
 */
public class Removeduplicates {
    static int removeDuplicates(int[] arr,int n){
        if(n==0 || n==1){
            return n;
        }
        int j=0;
        for (int i=0; i<n-1; i++)
        if (arr[i] != arr[i+1])
        arr[j++] = arr[i];
        arr[j++] = arr[n-1];
          
        return j;
        
    }
    public static void main(String args[]){
        int A[] = {10, 20, 20, 30, 40, 40, 40, 50, 50};
        
        int n= removeDuplicates(A,A.length);
        for(int i=0;i<n;i++){
            System.out.println(A[i]+" ");
        }
    }
}
