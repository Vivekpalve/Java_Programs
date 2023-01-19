/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RSL;

/**
 *
 * @author Lenovo
 */
public class Allrepeatingchar {
    static void check(String s){
        int[] ch  = new int[256];
        for(int i=0;i<s.length();i++){
            ch[s.charAt(i)]++;
        }
        String t ="";
        for(int i=0;i<ch.length;i++){
            if(ch[i]>=2){
                System.out.println((char)i+" "+ch[i]);
            }
        }
        for(int i=0;i<ch.length;i++){
            if(ch[i]>=1){
                t=t+(char)i+ch[i];
            }
        }
        System.out.println("the end :"+t);
    }
    static void check1(String s){
        int[] ch = new int[256];
        for(int i=0;i<s.length();i++){
            ch[s.charAt(i)]++;
        }
        for(int i=0;i<ch.length;i++){
            if(ch[i]>=2){
                System.out.println((char)i+" "+ch[i]+" "+ i);
            }
        }
    }
    public static void main(String args[]){
        String s = " aabbccddeefgh";
        check(s);
        check1(s);
    }
}
