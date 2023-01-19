/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_programs;

/**
 *
 * @author Lenovo
 */
public class Variables {
    
    static String cppToJava(String s){
        String ss="";
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='_'){
                ss+=Character.toUpperCase(s.charAt(i+1));
                i++;
            }
            else{
                ss+=s.charAt(i);
            }
        }
        return ss;
    }
    public static void main(String args[]){
        String s = "_modify_variable_name";
        System.out.println(cppToJava(s));
    }
}
