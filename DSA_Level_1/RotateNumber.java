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
public class RotateNumber {
    static void check(int n,int k){
        int t =n;
        int count=0;
        int mul=1;
        int div=1;
        while(t>0){
            count++;
            t=t/10;
        }
        for(int i=1;i<=count;i++){
            if(i<=k){
                div=div*10;
            }
            else{
                mul=mul*10;
            }
        }
        int q=n/div;
        int r=n%div;
        
        r = r*mul+q;
        System.out.println(r);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        check(n,k);
    }
}
