/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DSA_Level_1;

import java.util.*;

/**
 *
 * @author Lenovo
 */

public class PythagoreanTriplets {
    static void check(int a ,int b,int c){
        int max = Math.max(a,Math.max(b, c));
        if(max==a){
            boolean flag=(b*b+c*c)==(a*a);
            System.out.println(flag);
        }
        else if(max==b){
            boolean flag=(a*a+c*c)==(b*b);
            System.out.println(flag);
        }
        else{
            boolean flag=(b*b+b*a)==(c*c);
            System.out.println(flag);
        }
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        check(a,b,c);
    }
    
}
