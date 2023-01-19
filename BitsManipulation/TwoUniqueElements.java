/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BitsManipulation;

/**
 *
 * @author Lenovo
 */
public class TwoUniqueElements {
    static int[] twoUnique(int[] A){
        int[] a = new int[2];
        
        int xxory=0;
        for(int i: A){
            xxory=xxory^i;
        }
        int rmsb = xxory & -xxory;
        int t1=0;
        int t2=0;
        for(int i :A){
            if((rmsb & i)==0){
                t1=t1^i;
            }
            else{
                t2=t2^i;
            }
        }
        a[0]=t1;
        a[1]=t2;
        return a;
    }
    public static void main(String args[]){
        int[] A = new int[]{2,2,4,4,55,6,6,7,7,8,9,9,10,10};
        
        int[] t = twoUnique(A);
        System.out.println(t[0]+" "+t[1]);   
    }
}
