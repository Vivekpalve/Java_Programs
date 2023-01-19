/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_programs;

/**
 *
 * @author Lenovo
 */
public class Counting_Words_With_Given_Prefix {
    
    static int count(String s,int n1,int n2,String pref){
        int p1=0,p2=0;
        int cc=0;
        while(p1< n1 && p2< n2){
            if(pref.charAt(p1)==s.charAt(p2)){
                p1++;
                p2++;
            }
            else{
                break;
            }
        }
        if(p2==n2){
            cc++;
        }
        return cc;
    }
    public static int prefixCount(String[] words, String pref) {
        int c = 0;
        for(String w : words){
            c+=count(w,w.length(),pref.length(),pref);
        }
        return c;
    }
    public static void main(String args[]){
        String[] words = {"pay","attention","practice","attend"}; 
        String pref = "at";
        int c=prefixCount(words,pref);
        System.out.println(c);
    }
}
