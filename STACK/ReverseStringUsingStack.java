/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package STACK;

import java.util.Stack;

/**
 *
 * @author Lenovo
 */
public class ReverseStringUsingStack {
    private static void reverse(String s){
        Stack<Character> st = new Stack<Character>();
        String a="";
        for(int i=0;i<s.length();i++){
            st.push(s.charAt(i));
        }
        while(!st.isEmpty()){
            a+=st.pop();
        }
        System.out.println(a);
    }
    public static void main(String args[]){
        
        String s = "vivekpalve";
        reverse(s);
    }
}
