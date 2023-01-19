/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BitsManipulation;

/**
 *
 * @author Lenovo
 */
public class SingleElement {
    private static int element(int[] A){
        
        int res=0;
        for(int i:A){
            res=res^i;
        }
        return res;
    }
    public static void main(String args[]){
       int[] A = new int[]{22,34,22,34,67,5,67};
       System.out.println(element(A));
    }
}
