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
public class P3 {
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
        
        for(int i=n;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
