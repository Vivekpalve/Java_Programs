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
public class Subsequence {
    static void checkTwoString(String A,String B){
        int i=0;
        int j=0;
        int alen = A.length();
        int blen = B.length();
        
        while(i<alen && j<blen){
            char c1 = A.charAt(i);
            char c2 = B.charAt(j);
            
            if(c1==c2){
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        if(i==alen){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
    static void checkTwoArray(int[] A1,int[] A2){
        int i=0;
        int j=0;
        int alen = A1.length;
        int blen = A2.length;
        while(i<alen && j<blen){
            if(A1[i]==A2[j]){
                i++;j++;
            }
            else{
                j++;
            }
        }
        if(i==alen){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
    public static void main(String args[]){
        
       Scanner sc = new Scanner(System.in);
       
       String A = sc.next();
       String B = sc.next();
       
       checkTwoString(A,B);
       
       int[] A1 = new int[]{1,2,4};
       int[] A2 = new int[]{7,5,1,3,2,4};
       checkTwoArray(A1,A2);
    }
}
