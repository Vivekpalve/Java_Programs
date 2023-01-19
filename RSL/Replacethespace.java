/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RSL;

/**
 *
 * @author Lenovo
 */
public class Replacethespace {
    static void check(String s){
        String st="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                st+="%20";
            }else{
                st+=s.charAt(i);
            }
        }
        System.out.println(st);
    }
    public static void main(String args[]){
        String s = "My name is vivek palve Gorakshanath";
        
        check(s);
    }
}
