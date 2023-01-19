/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RSL;

import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class Plusone {
    
    static int[] check(int[] A){
        
        int i=A.length-1;
        while(i>=0){
            if(A[i]==9){
                A[i]=0;
            }else{
                A[i]=A[i]+1;
                return A;
            }
            i--;
        }
        int A1[] = new int[A.length+1];
        A1[0]=1;
        return A1;
        
    }
    public static void main(String args[]){
        int A[] = new int[]{9,9};
        
        int[] p=check(A);
        for(int i=0;i<p.length;i++){
            System.out.print(p[i]+" ");
        }
    }
}
