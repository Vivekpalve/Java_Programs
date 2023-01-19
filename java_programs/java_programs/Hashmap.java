/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_programs;

/**
 *
 * @author Lenovo
 */
import java.util.*;
public class Hashmap {
    
    public static void main(String args[]){
       int[] A = new int[]{7,12,16,10,6};
       
       
       
       int count =0;
       for(int i=0;i<5;i++){
           for(int j=0;j<5;j++){
               if((i<j)){
                   if(((A[i])&A[j])>=(A[i]^A[j])){
                       count++;
                   }
               }
           }
       }
       System.out.println(count);
}
    }
    
