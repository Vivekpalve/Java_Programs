/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BinarySearch;

/**
 *
 * @author Lenovo
 */
public class Xyz {
    
    public static int binary(int[] A1,int key){
        int l=0;
        int h=A1.length;
        
        while(l<=h){
            
        }
    }
    public static int[] check(int[] A1,int[] A2){
        int[] A  = new int[A2.length];
        int k=0;
        for(int i=0;i<A2.length;i++){
            A[k++] = binary(A1,A2[i]);
        }
        return A;
    } 
    public static void main(String args[]){
        int[] A1 = new int[]{95,90,80,75,75,70,65,60,55,55};
        int[] A2 = new int[]{55,65,100,85};
        
        int[] A3 = check(A1,A2);
    }
}
