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
//using formulas
//algo says that j=kill every alternate number from 1 to given number until the only one number cannot remain
public class JosephusAlgo1 {
    static int powerOf2(int n){
        int i=1;
        while(i*2<=n){
            i=i*2;
        }
        return i;
    }
    static int solution(int n){
        int hp2 = powerOf2(n);
        int l = n-hp2;
        return 2*l+1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int n =sc.nextInt();
        
        System.out.println(solution(n));
    }
}
