/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_programs;

/**
 *
 * @author Lenovo
 */
public class GroupOfWord {
    static void snakeCase(String s){
        String t = "";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                t+="_";
            }
            else{
                t+=s.charAt(i);
            }
        }
        System.out.println(t);
    }
    static void camelCase(String s){
        String t ="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                t+=Character.toUpperCase(s.charAt(i+1));
                i++;
            }
            else{
                t+=s.charAt(i);
            }
        }
        System.out.println(t);
    }
    static void pascalCase(String s){
        String t = "";
        t+=Character.toUpperCase(s.charAt(0));
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==' '){
                t+=Character.toUpperCase(s.charAt(i+1));
                i++;
            }
            else{
                t+=s.charAt(i);
            }
        }
        System.out.println(t);
    }
    public static void main(String args[]){
        String s = "user login count";
        snakeCase(s);
        camelCase(s);
        pascalCase(s);
    }
}
