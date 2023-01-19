/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RSL;

/**
 *
 * @author Lenovo
 */
public class Replacespacewith {
    static void check(String s){
        char[] ch = s.toCharArray();
         for(int i=0;i<ch.length;i++){
             if(ch[i]==' '){
                 ch[i] = '&';
             }
         }
         String sp = String.valueOf(ch);
         System.out.println(sp);
    }
    public static void main(String args[]){
        
        String s ="Good people are like candles";
        
        check(s);
    }
}
