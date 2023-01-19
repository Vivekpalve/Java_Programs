/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Slindingwindow;
import java.util.*;
/**
 *
 * @author Lenovo
 */
public class CountOcurranceOfAnagram {
    static void check(String s,String p){
        ArrayList<Integer> l = new ArrayList<>();
        HashMap<Character,Integer>  hm = new HashMap<>();
        
        for(int i=0;i<p.length();i++){
            hm.put(p.charAt(i),hm.getOrDefault(p.charAt(i),0)+1);
        }
        int i=0;
        int j=0;
        int k=p.length();
        int count=hm.size();
        while(j<s.length()){
            if(hm.containsKey(s.charAt(j))){
                hm.put(s.charAt(j), hm.get(s.charAt(j))-1);
                if(hm.get(s.charAt(j))==0){
                    count--;
                }
            }
            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                if(count==0){
                    l.add(i);
                }
                if(hm.containsKey(s.charAt(i))){
                    hm.put(s.charAt(i), hm.get(s.charAt(i))+1);
                    if(hm.get(s.charAt(i))==1){
                        count++;
                    }
                }
                i++;
                j++;
            }
        }
        for(int ih = 0; ih < l.size(); ih++) {   
            System.out.println(l.get(ih));
        }
    }
    public static void main(String args[]){
        String s = "cbaebabacd";
        String p = "aaba";
        
        check(s,p);
    }
}
