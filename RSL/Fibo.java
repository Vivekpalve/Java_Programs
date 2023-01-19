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
public class Fibo {
    static int check(int n){
        int a=0;
        int b=1;
        int c=0;
        int sum=0;
        for(int i=3;b<=n;i++){
            if(n==b){
                return n;
            }else{
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
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.println(check(n));
        String s ="sdffghjkkl";
	   String s1="";
	   s1=s;
	   System.out.println(s1);
    }
}
