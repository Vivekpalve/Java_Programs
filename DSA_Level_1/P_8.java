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
public class P_8 {
    static void check(int n){
        int sp=n-1;
        for(int i=1;i<=n;i++){
            for(int j=sp;j>=1;j--){
                System.out.print("\t");
            }
            System.out.print("*\t");
            sp--;
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        check(n);
    }
}
