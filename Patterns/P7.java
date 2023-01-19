/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_programs.Patterns;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class P7 {
    public static void main(String args[]){
        /*
        print
        * * * * *
          * * * *
            * * *
              * *
                *
         */   
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=0;
        
        for(int i=n;i>=1;i--){
            
            for(int j=1;j<=count;j++){
                System.out.print(" ");
            }
            for(int k=1+count;k<=n;k++){
                System.out.print("*");
            }
            System.out.println();
            count++;
        }
        
    }
}
