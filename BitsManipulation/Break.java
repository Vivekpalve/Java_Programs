/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BitsManipulation;

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Break
{
    static void check(int[] A ,int n){
        int ce=0;
        int co=0;
        for(int i=0;i<n;i++){
            if(A[i]%2==0){
                ce++;
            }
            else{
                co++;
            }
        }
        if(ce>co){
            System.out.println(co);
        }
        else{
            System.out.println(ce);
        }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0){
		    int n = sc.nextInt();
		    int[] A = new int[n];
		    for(int i=0;i<n;i++){
		        A[i] = sc.nextInt();
		    }
		    check(A,n);
		    t--;
		}
	}
}
