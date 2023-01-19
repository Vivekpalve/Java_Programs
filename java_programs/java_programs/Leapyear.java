/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_programs;

/**
 *
 * @author Lenovo
 */
import java.util.*;
public class Leapyear {
    
    public static void leapYear(int year,int n){
           boolean flag=false;
           if(year%4==0 || year%400==0 && year%100!=0){
                flag=true;
            }
            else {
                flag=false;
            }
           while(flag==true && n>0){
               System.out.println(year);
               n--;
               year+=4;
           }
           
       
        
        
    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int year =sc.nextInt();
        int n=sc.nextInt();
        leapYear(year,n);
    }
}
