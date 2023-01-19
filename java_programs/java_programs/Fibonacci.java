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
public class Fibonacci {
    static int fibo(int n){
        int a=0,b=1;
        int c;
        int sum=0;
        
        for(int i=3;b<=n;i++){
            if(b==n){
                return n;
            }
            else{
                c=a+b;
                a=b;
                b=c;
            }
            if(c%2==0){
                sum+=c;
            }
        }
        
       return sum;
    }
    public static void main(String args[]){
        
        Scanner sc  = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        System.out.println(fibo(n));
    }
}
