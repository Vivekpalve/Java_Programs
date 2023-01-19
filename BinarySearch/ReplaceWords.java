/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BinarySearch;

/**
 *
 * @author Lenovo
 */
import java.util.*;
public class ReplaceWords {
    static String replaceWord(List<String> d,String str){
        HashSet<String> hs = new HashSet<>();
        for(String i : d){
            hs.add(i);
        }
        StringBuilder sb = new StringBuilder();
        String[] s = str.split(" ");
        for(int i=0;i<s.length;i++){
            String p = "";
            for(int j=1;j<=s[i].length();++j){
                p = s[i].substring(0,j);
                if (hs.contains(p)) 
                    break;
            }
            if(sb.length()>0) 
                sb.append(" ");
            sb.append(p);
        }
        return sb.toString();
    }
    public static void main(String args[]){
        ArrayList<String> l = new ArrayList<>();
        l.add("cat");
        l.add("bat");
        l.add("rat");
        
        String s= "the cattle was rattled by the battery";
        String st = replaceWord(l,s);
        System.out.println(st);
    }
}
