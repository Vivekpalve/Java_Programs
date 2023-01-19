/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RSL;

/**
 *
 * @author Lenovo
 */
public class Removespace {
    static void check(String str){
        int s=0;
        String st="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' ' || i==str.length()-1){
                int e;
                if(i==str.length()-1){
                    e=i;
                }
                else{
                    e=i-1;
                }
                st+=str.substring(s, e+1);
                s=i+1;
            }
        }
        System.out.println(st);
    }
    public static void main(String args[]){
        String s ="my name vivek palve ";
        check(s);
    }
}
