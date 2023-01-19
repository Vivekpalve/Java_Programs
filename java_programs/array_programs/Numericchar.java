/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_programs.array_programs;

/**
 *
 * @author Lenovo
 */
import java.util.*;
public class Numericchar {
    
    static void check(String s){
        HashMap<Character,Integer> hm = new HashMap<>();
        int count=0;
        for(char ch : s.toCharArray()){
            if(Character.isDigit(ch)){
                hm.put(ch,hm.getOrDefault(ch,0)+1);
            }
        }
        
        for(Map.Entry<Character,Integer> e :hm.entrySet()){
            count+=e.getValue();
            System.out.println(e.getKey()+" = "+e.getValue());
        }
        System.out.println(s.length()-count);
    }
    public static void main(String args[]){
        
        String s = "raja11238labss";
        
        check(s);
    }
}
