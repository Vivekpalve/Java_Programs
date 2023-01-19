/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BinarySearch;

/**
 *
 * @author Lenovo
 */
import java.util.*;
public class Cogno_2 {
    static void check(int n){
        int[] A1 = new int[6];
        int[] A2 = new int[6];
        int a =0;
        int b=1;
        A1[0]=0;
        A1[1]=1;
        int count=2;
        while(count<n){
            int t =a+b;
            a=b;
            b=t;
            A1[count++]=t;
        }
        int x = 2;

         for(int i = 0; i <= n; i++){
            int count1 = 0;
                for(int j = 1; j <= x; j++){
                   if(x%j == 0)
                      count++;
                }
                if(count1 == 2){
                   A2[i]=x;
                }
                x++;
            }
        for(int i=0;i<n;i++){
            System.out.print(A1[i]);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        check(n);
    }
}
