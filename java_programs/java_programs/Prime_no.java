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
public class Prime_no {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.print("enter element upto n");
        int n=sc.nextInt();
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("no is Prime no!");
        }
        else{
            System.out.println("no is not Prime no!");
        }
    }
}
