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
public class P_11 {
    public static void check(int n){
        int a =0;
        int b =1;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(a+"\t");
                int c = a+b;
                a=b;
                b=c;
                
            }
            System.out.println();
        }   
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        check(n);
    }
}
