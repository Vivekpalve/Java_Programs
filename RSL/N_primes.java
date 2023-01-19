/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RSL;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class N_primes {
    static void primeSieve(int n){
        int[] prime = new int[n];
        for(int i=2;i<=n;i++)
        {
           if(prime[i]==0)
           {
              for(int j=i*i;j<=n;j+=i)
              {
                 prime[j]=1;
              }
           }
        }
        
        //prime
        
         
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        sc.nextLine();
//        String s = sc.nextLine();
        
        primeSieve(n);
    }
}
