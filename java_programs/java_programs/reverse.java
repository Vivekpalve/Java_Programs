/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_programs;

public class reverse {
    public static void main(String args[]){
        String s="vivek";
        String ss="";
        char[] ch =s.toCharArray();
        for(int i=s.length()-1;i>=0;i--){
            ss+=ch[i];
        }
        System.out.println(ss);
    }
}
