/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_programs;

import java.util.*;
public class removevowels {
    public static void main(String args[]){
            String s =" sdfrefkvvditoukla";
	    StringBuilder b= new StringBuilder();
	    Set<Character> v =new HashSet<Character>();
	    v.add('a');
	    v.add('e');
	    v.add('i');
	    v.add('o');
	    v.add('u');
	    for(char c:s.toCharArray()){
	        if(!v.contains(c)){
	            b.append(c);
	        }
	    }
	    System.out.println(b.toString());
    }
}
