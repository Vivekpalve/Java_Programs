/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_programs;

import java.util.*;
public class Perfect_no {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.print("enter the no to check wheather it is perfect no or not");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        if(sum==n){
            System.out.print("given no is perfect!");
        }
        else{
            System.out.print("Not perfect!");
        }
    }
}
