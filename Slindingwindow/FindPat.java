/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Slindingwindow;
import java.util.*;
public class FindPat {
    static int fun(String s ,String pat){
        int i=0;
        int j=0;
        int k=pat.length();
        ArrayList<Integer> l = new ArrayList<Integer>();
        while(j<s.length()){
            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                if(pat.contains(s.substring(i,j+1))){
                    l.add(i+1);
	        	}
                i++;
                j++;
            }
        }
        return l.get(l.size()-1);
    }
    public static void main(String args[]){
        String s ="omkarbhisedon";
        String pat ="bhisedon";
        int n=fun(s,pat);
        System.out.println(n);
    }
}
