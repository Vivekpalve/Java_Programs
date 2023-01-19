/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RSL;

/**
 *
 * @author Lenovo
 */
public class Frequency{
    static void check(String s){
        int[] ch =  new int[256];
        for(int i=0;i<s.length();i++){
            ch[s.charAt(i)]++;
        }
        for(int i=0;i<ch.length;i++){
            if(ch[i]>=1){
                System.out.println((char)i+" "+ch[i]+" "+i);
            }
        }
    }
    public static void main(String args[]){
        String s = "daabcbaabcbc";
        check(s);
    }    
}
