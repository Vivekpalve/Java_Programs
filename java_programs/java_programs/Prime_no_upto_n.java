/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_programs;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Prime_no_upto_n {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.print("enter element upto n");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int count=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                   count++;
                }
            }
               if(count==2){
                   System.out.println("no is Prime no!"+i);
                } 
        }
    }
}
