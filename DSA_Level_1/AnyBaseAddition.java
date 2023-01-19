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
public class AnyBaseAddition {
    static void check(int n1,int n2,int b){
        int res=0;
        int p=1;
        int c=0;
        while(n1>0 || n2>0 || c>0){
            int d1 = n1%10;
            int d2 = n2%10;
            n1/=10;
            n2/=10;
            
            int d =d1+d2+c;
            c=d/b;
            d=d%b;
            
            res+=d*p;
            p=p*10;
        }
        System.out.println(res);
    }
    static public void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int b = sc.nextInt();
        check(n1,n2,b);
    }
    
}
