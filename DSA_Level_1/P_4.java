/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DSA_Level_1;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class P_4 {
    static void check(int n){
     int sp=0;
     int s=n;
     for(int i=1;i<=n;i++){
         for(int k=1;k<=sp;k++){
             System.out.print("\t");
         }
         for(int j=1;j<=s;j++){
             System.out.print("*\t");
         }
         sp++;
         s--;
         System.out.println();
     }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        check(n);
    }
}
