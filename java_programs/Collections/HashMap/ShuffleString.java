/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_programs.Collections.HashMap;

/**
 *
 * @author Lenovo
 */
public class ShuffleString {
    private static void check(int[] A,String s){
        StringBuilder sb = new StringBuilder();
        char[] ch = new char[s.length()];
        
        for(int i=0;i<s.length();i++){
            ch[A[i]] = s.charAt(i);
        }
        for(int i=0;i<A.length;i++){
            sb.append(ch[i]);
        }
        System.out.println(sb.toString());
    }
    public static void main(String args[]){
        String s = "codeleet";
        
        int[] A = new int[]{4,5,6,7,0,2,1,3};
        check(A,s);
    }
}
