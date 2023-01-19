/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_programs.array_programs;

/**
 *
 * @author Lenovo
 */
public class Second_max_min {
    static void min_max(int[] A){
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        
        for(int i=0;i<A.length;i++){
            if(A[i]>max1){
                max2=max1;
                max1=A[i];
            }
            else if(A[i]>max2){
                max2=A[i];
            }
            if(A[i]<min1){
                min2=min1;
                min1=A[i];
            }
            else if(A[i]<min2){
                min2=A[i];
            }
            
        }
        System.out.print(min1+" "+min2+" "+max1+" "+max2);
        
    }
    public static void main(String args[]){
        int[] A = {10,10,10,10};
        
        min_max(A);
    }
}
