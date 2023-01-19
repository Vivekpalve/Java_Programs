/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_programs;

/**
 *
 * @author Lenovo
 */
public class Countdigits {
    public static void main(String args[]){
        int count=0;
        int n= 12345;
        while(n>0){
//            count++;
            n=n/10;
            count++;
        }
        System.out.println(count);
    }
}
