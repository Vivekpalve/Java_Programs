/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DSA_Level_1;

/**
 *
 * @author Lenovo
 */
import java.util.*;
public class DecimalToAnyBase {
    public static void check2(int n ,int k){
        int  res =0;
        int p=1;
        while(n>0){
            int d = n%k;
            n=n/k;
            res+=d*p;
            p=p*10;
        }
        System.out.println(res);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        check2(n,k);
    }
}
