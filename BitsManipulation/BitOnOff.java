/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BitsManipulation;

/**
 *
 * @author Lenovo
 */
//take input a number
//on its I number bit 
//off its j th number bit

import java.util.*;
public class BitOnOff {
    
    public static void main(String args[]){
      Scanner  sc = new Scanner(System.in);
      
        int n = sc.nextInt();
        int I = sc.nextInt();
        int J = sc.nextInt();
        
        int onmask = (1<<I);
        int offmask = ~(1<<J);
        
        System.out.println(n|onmask);
        System.out.println(n&offmask);
    }
}
