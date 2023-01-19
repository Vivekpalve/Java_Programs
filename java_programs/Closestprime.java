/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_programs;

/**
 *
 * @author Lenovo
 */
import java.util.*;
public class Closestprime {
    static boolean check(int n){
        for(int i=n-1;i>1;i--){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    static void prime(int n){
        int i=1;
        boolean flag =true;
        while(true){
            if(check(n-i)){
                System.out.print(n-1+" ");
                flag=true;
            }
            if(check(n+i)){
                System.out.print(n+1);
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
        prime(n);
    }
}
