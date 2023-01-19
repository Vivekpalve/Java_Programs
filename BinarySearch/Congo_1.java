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
public class Congo_1 {
    static void check(int n){
        if(n>100){
            System.out.println("Invalid input");
        }
        if(n<=100 && n>=91){
            System.out.println("S");
        }
        else if(n<=90 && n>=81){
            System.out.println("A");
        }
        else if(n<=80 && n>=71){
            System.out.println("B+");
        }
        else if(n<=70 && n>=61){
            System.out.println("B");
        }
        else if(n<=60 && n>=51){
            System.out.println("C");
        }
        else if(n<=50 && n>=41){
            System.out.println("D");
        }
        else if(n<=40 && n>=0){
            System.out.println("U");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-->0){
            int n = sc.nextInt();
            check(n);
            t--;
        }
    }
}
