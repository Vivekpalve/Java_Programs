/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BitsManipulation;

/**
 *
 * @author Lenovo
 */
import java.util.*;
//counts the how many number of bits are one
public class KernighansAlgorithm {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=0;
        while(n!=0){
            count++;
            int rsbm = n & -n;
            n=n-rsbm;
        }
        System.out.println(count);
    }
}
