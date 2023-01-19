/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_programs;

/**
 *
 * @author Lenovo
 */
public class FirstLetterOfWordMakeCaptital {
    static void check(String s){
        char[] ch = s.toCharArray();
        boolean flag= true;
        
        for(int i=0;i<ch.length;i++){
            if(Character.isLetter(ch[i])){
                if(flag){
                    ch[i]=Character.toUpperCase(ch[i]);
                    flag=false;
                }
            }
            else{
                flag=true;
            }
        }
        s = String.valueOf(ch);
        System.out.println(s);
    }
    public static void main(String args[]){
        
        String s ="vivek Palve";
        check(s);
    }
}
