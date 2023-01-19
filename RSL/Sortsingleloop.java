/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RSL;

/**
 *
 * @author Lenovo
 */
public class Sortsingleloop {
    static void check(int[] A){
        for(int i=0;i<A.length-1;i++){
            if(A[i]>A[i+1]){
                int t = A[i];
                A[i] = A[i+1];
                A[i+1]=t;
                i=-1;
            }
        }
        for(int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
    }
    public static void main(String args[]){
        int[] A = new int[]{1,0,0,1,0,1,0,1,0,1};
        
        check(A);
    }
}
