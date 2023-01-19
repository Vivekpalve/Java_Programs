/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RSL;

/**
 *
 * @author Lenovo
 */
import java.util.*;
public class Mind {
    static void check(Integer[] A,int k,int n){
        System.out.println(Arrays.toString(A)); 
        Arrays.sort(A,0,k); 
        Arrays.sort(A,k,n,Collections.reverseOrder()); 
        System.out.println(Arrays.toString(A));
    }
    static void check1(int[] A){
        int max1=Integer.MIN_VALUE;
        int max2 =Integer.MIN_VALUE;
        
        for(int i=0;i<A.length;i++){
            if(A[i]>max1){
                max2=max1;
                max1=A[i];
            }
            else if(A[i]>max2 && A[i]!=max1){
                max2=A[i];
            }
        }
        System.out.println(max1+" "+max2);
    }
    public static void main(String args[]){
        Integer[] A = new Integer[]{7,43,12,4,1,3,78,6};
         check(A,4,8);
         int[] A1 = new int[]{4,9,8,5,7,9};
         check1(A1);
    }
}
