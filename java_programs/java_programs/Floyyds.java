/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_programs;

import java.util.*;
public class Floyyds {
    
    static void floyydsTriangle(int n){
        int k=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(k++ +" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        
  
         Scanner sc = new Scanner(System.in);
         int n =sc.nextInt();
         floyydsTriangle(n);
         char ch ='a';
         for(int i=0;i<26;i++){
             System.out.println(ch++);
         }
    }
}
//5
//1
//2 3
//4 5 6
//7 8 9 10
//11 12 13 14 15