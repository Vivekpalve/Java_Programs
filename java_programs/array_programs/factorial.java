/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_programs.array_programs;

/**
 *
 * @author Lenovo
 */
import java.math.BigInteger;
import java.util.*;
public class factorial {
    static void fact(int n){
        BigInteger s = new BigInteger("1");
        for(int i=2;i<=n;i++){
            s = s.multiply(BigInteger.valueOf(i));
        }
        System.out.print(s);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        
        fact(n);
    }
}
