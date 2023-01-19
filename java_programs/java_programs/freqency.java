/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_programs;

/**
 *
 * @author Lenovo
 */
import java.util.*;
public class freqency {
    static void countFrequency(String ss){
        String s=ss.toLowerCase();
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray())
        {
           if(Character.isDigit(c))map.put(c,map.getOrDefault(c,0)+1);
        }
        int count=0;
        for(char c:map.keySet())
        {
        System.out.print(c+"="+map.get(c)+", ");
        count+=map.get(c);
        }
        System.out.println ("others="+(s.length()-count));
     }
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        String s =sc.next();
        countFrequency(s);
    }
}
