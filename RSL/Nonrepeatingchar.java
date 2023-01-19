/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RSL;

import java.util.Arrays;

/**
 *
 * @author Lenovo
 */
public class Nonrepeatingchar {
    
    
    static void check(String s){
        int[] ch = new int[256];
        int pos=-1;
        for(int i=0;i<s.length();i++){
            ch[s.charAt(i)]++;
        }
        for(int i=0;i<s.length();i++){
            if(ch[s.charAt(i)]==1){
                pos=i;
                break;
            }
        }
        if(pos==-1){
            System.out.println("all elements are repeating");
        }
        else{
            System.out.println(s.charAt(pos));
        }
    }
    public static void main(String args[]){
        String s ="hello world hi hey";
        
        check(s);
    }
}