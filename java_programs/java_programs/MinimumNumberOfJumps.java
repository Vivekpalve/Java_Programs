/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_programs;

/**
 *
 * @author Lenovo
 */
public class MinimumNumberOfJumps {
    
    static void check(int[] A){
        int count=0;
        
        for(int i=0;i<A.length;i++){
            if(A[i]!=A.length && i!=A.length){
                count++;
                i+=A[i];
            }
        }
        System.out.println(count);
    }
    
    public static void main(String args[]
    ){
        
        int[] A = new int[]{1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9} ;
        
        check(A);
    }
}
