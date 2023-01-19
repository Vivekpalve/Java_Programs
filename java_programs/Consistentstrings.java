/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_programs;

/**
 *
 * @author Lenovo
 */
public class Consistentstrings {
    
    static int countString(String s,String all){
        int[] A = new int[26];
        int c2=0;
        for(int i=0;i<A.length;i++){
            A[i]=0;
        }
        for(int i=0;i<s.length();i++){
            A[s.charAt(i)-'a']++;
            A[all.charAt(i)-'a']--;
        }
//        for(int i=0;all.length();i++){
//            A[all.charAt(i)-'a']--;
//        }
        for(int i:A){
            if(A[i]!=0){
                return 0;
            }else{
                c2+=1;
            }
        }
        return c2;
    }
    public int countConsistentStrings(String allowed, String[] words) {
        
        int c1=0;
        for(int i=0;i<words.length;i++){
            
            c1+=countString(words[i],allowed);
            
        }
        return c1;
    }
    public static void main(String args[]){
        
    }
}
