/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RSL;

/**
 *
 * @author Lenovo
 */
public class RemoveAllOccurrencesSubstring {
    private static void removeAll(String s,String b){
        StringBuilder sb = new StringBuilder(s);
        int l=b.length();
        while(sb.toString().contains(b)){
            int i = sb.indexOf(b);
            sb.delete(i, i+l);
        }
        System.out.println(sb.toString());
    }
    
    public static void main(String args[]){
        String s ="daabcbaabcbc";
        String b ="abc";
        
        removeAll(s,b);
    }
}
