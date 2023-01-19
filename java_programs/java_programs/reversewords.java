/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_programs;

/**
 *
 * @author Lenovo
 */
public class reversewords {
    
    static void reverse(String s){
        String[] ss =s.split("\\.");
        String p="";
        
        for(int i=ss.length-1;i>=0;i--){
           p+=ss[i]+".";
        }
        String sp="";
        char[] ch =p.toCharArray();
        for(int i=0;i<ch.length-1;i++){
            sp+=ch[i];
        }
        System.out.print(sp);
        
        
    }
    public static void main(String args[]){
        String s="my.name.is.vivek.palve";
        
        reverse(s);
    }
}
