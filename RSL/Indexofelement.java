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
public class Indexofelement {
    static void check(int[] A,int n){
        if(n>A[0]){
            System.out.println("1");
            return ;
        }
        int x=1;
        for(int i=0;i<A.length-1;i++){
            if(A[i]!=A[i+1]){
                x++;
            }
            if(A[i]==n){
                System.out.println(x);
            }
            if(A[i]>=n && A[i+1]<=n){
                System.out.println(x);
            }
        }
        if(x==A.length){
            System.out.print(x);
            
        }
    }
    public static void main(String args[]){
        int[] A = new int[]{98,86,76,65,54,32,21,12,9};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        check(A,n);
    }
}