/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_programs.Collections.HashMap;

/**
 *
 * @author Lenovo
 */
import java.util.*;
public class FrequencyCharacter {
    private static int check(String s){
        HashMap<Character,Integer> hm = new HashMap<>();
        int max = 0;
        for(int i =0;i<s.length();i++){
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
        }
        for(Map.Entry<Character,Integer> e : hm.entrySet()){
            if(max<e.getValue()){
                max=e.getValue();
            }
        }
        return max;
    }
    public static void main(String args[]){
        
        String s = "abrakadabra";
        
        int c = check(s);
        System.out.println(c);
    }
}
