/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_programs;

import java.util.*;

/**
 *
 * @author Lenovo
 */
public class Alternatewords {
    static void alternate(String ss){
        String[] word = ss.split("\\.");
        List<String> l = new ArrayList<>();
        for(int i=0;i<word.length;i=i+2){
            l.add(word[i]);
        }
        String s = String.join(".",l);
        System.out.println(s);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        String s =sc.next();
        
        alternate(s);
    }
}
