/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RSL;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Anagram {
    static int max_char=256;
    
    static boolean checkAnagram(String A,String B){
        if(A.length()!=B.length()){
            return false;
        }
        int[] ch = new int[max_char];
        
        for(int i=0;i<A.length();i++){
            ch[A.charAt(i)]++;
            ch[B.charAt(i)]--;
        }
        for(int i=0;i<max_char;i++){
            if(ch[i]!=0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
       
       String A = sc.next();
       String B = sc.next();
       
       System.out.println(checkAnagram(A,B));
    }
}
