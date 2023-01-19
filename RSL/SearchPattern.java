/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RSL;
import java.util.*;
/**
 *
 * @author Lenovo
 */
public class SearchPattern {
    static void check(String s ,String pat){
        ArrayList<Integer> l = new ArrayList<>();
        int i=0;
        int j=0;
        int k=pat.length();
        while(j<s.length()){
            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                if(s.substring(i,j+1).equals(pat)){
                    l.add(i+1);
                }
                i++;j++;
            }
        }
        if(l.size()==0){
            l.add(-1);
        }
        System.out.println(l);
    }
    public static void main(String args[]){
        String s ="batmanandrobinarebat";
        String pte = "bat";
        check(s,pte);
    }
}
