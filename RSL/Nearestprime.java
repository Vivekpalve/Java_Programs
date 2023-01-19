/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RSL;

/**
 *
 * @author Lenovo
 */
import java.util.*;
public class Nearestprime {
    static boolean isprime(int n){
        
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
        return true;
    }
    static void check(int n){
        if(isprime(n)){
            System.out.println(n);
            return;
        }
        int i=1;
        boolean flag=false;
        while(true){
            
            if(isprime(n-i)){
                System.out.println(n-1);
                flag=true;
            }
            if(isprime(n+i)){
                System.out.println(n+1);
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
