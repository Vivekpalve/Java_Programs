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
public class P5 {
    public static void main(String args[]){
        /*
        print
        *
        * *
        * * *
        * * * *
        * * * * *
        * * * *
        * * *
        * *
        *
         */   
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
