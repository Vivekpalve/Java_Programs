/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_programs;

import java.util.*;
public class Valid_anagram {
    private static Scanner sc;
	
	public static void main(String[] args) {
            
		String s;
		int i = 0;
			
		sc= new Scanner(System.in);

                int sum1=0;
		System.out.print("\n Please Enter any Sentence for ASCII Codes :  ");
		s = sc.nextLine();
			
		while(i < s.length())
		{
			sum1+=s.codePointAt(i);
			i++;
		}
                String ss;
		int j= 0;
			
		sc= new Scanner(System.in);

                int sum2=0;
		System.out.print("\n Please Enter any Sentence for ASCII Codes :  ");
		ss = sc.nextLine();
			
		while(j < s.length())
		{
			sum2+=ss.codePointAt(j);
			j++;
		}
                if(sum1==sum2){
                    System.out.println("true");
                }
                else{
                    System.out.println("false");
                }
        }
}
