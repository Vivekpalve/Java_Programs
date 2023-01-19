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
public class SecondLargest {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int a =sc.nextInt();
        int b =sc.nextInt();
        int c =sc.nextInt();
        
        if(a>b && a<c){
            System.out.println(a);
        }
        else if(b>a && b<c){
            System.out.println(b);
        }
        else{
           System.out.println(c);   
        }
    }
}
