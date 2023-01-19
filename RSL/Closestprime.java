/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RSL;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Closestprime {
    static boolean isPrime(int n){
        for(int i=n-1;i>1;i--){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    static void check(int n){
        
        int i=1;
         boolean flag=false;
        while(true){
            if(isPrime(n-i)){
                System.out.println(n-i+" ");
                flag=true;
            }
            if(isPrime(n+i)){
                System.out.println(n+i+" ");
                flag=true;
            }
            i++;
            if(flag){
                return;
            }
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        check(n);
    }
}
