/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RSL;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Prime {
    static boolean check(int n){
        for(int i= n-1;i>1;i--){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        System.out.println(check(n));
    }
}
