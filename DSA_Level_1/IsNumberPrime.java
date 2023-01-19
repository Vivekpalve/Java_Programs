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
public class IsNumberPrime {
    static boolean check(int n){
        
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    static boolean check2(int n){
        for(int i=n-1;i>1;i--){
          if(n%i==0){
              return false;
          }
       }
        return true;
    }
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        Boolean t = check(n);
        Boolean t1 = check2(n);
        System.out.println(t);
    }
}
