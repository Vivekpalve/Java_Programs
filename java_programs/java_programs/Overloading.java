/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_programs;

/**
 *
 * @author Lenovo
 */
public class Overloading {
    static int add(int a,int b){
        return  a+b;
    }
    static float add(float a,float b){
        return a+b;
    }
    public static void main(String args[]){
        System.out.print(add(12.6f,12.7f));
    }
}
