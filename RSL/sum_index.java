/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RSL;

/**
 *
 * @author Lenovo
 */
public class sum_index {
    public static void sum(int[] A){
        int sum=A[0];
        for(int i=1;i<A.length;i++){
            sum=A[i-1]+A[i];
            A[i]=sum;
        }
        for(int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
    }
    public static void main(String args[]){
        
        int[] A = new int[]{1,2,3,5};
        sum(A);
    }
}
