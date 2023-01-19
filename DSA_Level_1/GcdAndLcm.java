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
public class GcdAndLcm {
    static void check(int n1 ,int n2){
        int n11=n1;
        int n22=n2;
        while(n1%n2!=0){
            int rem = n1%n2;
            n1=n2;
            n2=rem;
        }
        int gcd =n2;
        int lcm=(n11*n22)/gcd;
        System.out.println(gcd);
        System.out.println(lcm);
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        
        check(n1,n2);
    }
}
