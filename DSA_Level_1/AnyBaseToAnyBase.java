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
public class AnyBaseToAnyBase {
    public static int check1(int n,int k){
        int p=1;
        int res=0;
        while(n>0){
            //1172
            int d = n%10;
            n=n/10;
            res+=d*p;
            p=p*k;
        }
        return res;
    }
    public static int check2(int n ,int k){
        int  res =0;
        int p=1;
        while(n>0){
            int d = n%k;
            n=n/k;
            res+=d*p;
            p=p*10;
        }
        return res;
    }
    public static void check(int n,int a,int b){
        int d = check1(n,a);
        int t = check2(d,b);
        System.out.println(t);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        check(n,a,b);
    }
}
