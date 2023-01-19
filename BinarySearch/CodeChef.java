/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BinarySearch;

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t  = sc.nextInt();
		while(t>0){
		    int n = sc.nextInt();
		    int x = sc.nextInt();
		    double p = x*n/4.0;
                    System.out.println(p);
                    System.out.println((int)(Math.ceil(p)));
		    t--;
		}
	}
}
