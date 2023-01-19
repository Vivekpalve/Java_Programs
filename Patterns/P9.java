/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_programs.Patterns;

import java.util.Scanner;

/**
        * 
       * *
     * * * *
   * * * * * *
 * * * * * * * *
 */
public class P9 {
    static void check(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=(i-1)*2+1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        check(n);
    }
}
