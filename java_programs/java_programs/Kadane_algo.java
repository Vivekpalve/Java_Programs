/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_programs;

/**
 *
 * @author Lenovo
 */
public class Kadane_algo {
    public static int maxsum(int[] A){
        int count=0;
        int max=0;
        for(int i=0;i<A.length;i++){
            count+=A[i];
            if(max<count){
                max=count;
            }
            if(count<0){
                count=0;
            }
        }
        return max;
    }
    public static void main(String args[]){
        
        int[] A={-2,1,-3,4,-1,2,1,-5,4};
        
        int a=maxsum(A);
        System.out.println(a);
        
    }
}
