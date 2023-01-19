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
public class DigitsFrequency {
    private static void check(int n ,int k){
        int count=0;
        while(n>0){
            if(n%10==k){
                count++;
            }
            n/=10;
        }
        System.out.println(count);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        check(n,k);
        
    }
}
