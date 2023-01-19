/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_programs.Collections.HashMap;

/**
 *
 * @author Lenovo
 */
public class ShuffleArray {
    private static void check(int[] A,int n){
        int[] ans = new int[n*2];
        int j=0,k =n;
        for(int i=0;i<A.length-1;i++){
            if(i%2==0){
                ans[i] = A[j];
                ans[i+1] = A[k];
                j++;
                k++;
            }
        }
    }
    public static void main(String args[]){
        int[] A = new int[]{2,3,4,5,6,7};
        
        check(A,3);
    }
}
