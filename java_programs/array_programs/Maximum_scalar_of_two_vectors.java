/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_programs.array_programs;

import java.util.*;

public class Maximum_scalar_of_two_vectors {
    
    static void maximumScalar(int[] A1,int[] A3){
        Arrays.sort(A1);
        Arrays.sort(A3);
        int p=0;
        for(int i=0;i<A1.length;i++){
            p+=A1[i]*A3[i];
        }
        System.out.print(p);
    }
    public static void main(String args[]){
        int A1[] = {1, 2, 6, 3, 7};
        int A2[] = {10, 7, 45, 3, 7};
        maximumScalar(A1,A2);
    }
}
