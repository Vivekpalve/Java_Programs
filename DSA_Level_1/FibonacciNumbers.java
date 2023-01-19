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
public class FibonacciNumbers {
    static void check(int n,int a, int b){
        for(int i=2;i<n;i++){
            int c =a +b;
            a=b;
            b=c;
            System.out.print(" "+c+" ");
        }
        
    }
    public static void main(String args[]){
        int a =0,b=1;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(a+" "+b);
        
        check(n,a,b);
    }
}
