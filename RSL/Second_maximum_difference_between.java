/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RSL;

/**
 *
 * @author Lenovo
 */
public class Second_maximum_difference_between {
    static void check(int[] A){
        int max=Integer.MIN_VALUE;
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        for(int i=0;i<A.length;i++){
            if(A[i]>max){
                max=A[i];
            }
            if(A[i]<min1){
                min2=min1;
                min1=A[i];
            }
            else if(A[i]<min2){
                min2=A[i];
            }
        }
        System.out.println(max-min2);
    }
    public static void main(String args[]){
        int[]arr = new int[]{14,12,70,95,65,22,30};
        
        check(arr);
    }
}
