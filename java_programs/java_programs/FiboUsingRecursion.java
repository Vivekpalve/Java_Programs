/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_programs;

/**
 *
 * @author Lenovo
 */
public class FiboUsingRecursion {
    static void fiboRecursion(int a,int b,int num){
        if(num==0){
            return;
        }
        System.out.print(a+b+" ");
        fiboRecursion(b,a+b,--num);
    }
    public static void main(String args[]){
        
        System.out.print("0 1 ");
        
        fiboRecursion(0,1,10);
    }
}
