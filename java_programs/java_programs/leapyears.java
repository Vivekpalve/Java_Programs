/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_programs;

/**
 *
 * @author Lenovo
 */
public class leapyears {
    
    public static void main(String args[]){
        int n=2012;
        
        if(n%4==0 || n%400==0){
            System.out.println(n);
        }
        else{
            System.out.println("not a leap ");
        }
    }
}
