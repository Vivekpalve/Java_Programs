/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RSL;

import java.util.Scanner;
import java.io.*;
/*

*/
public class First_letter_of_every_word {
    static String check(String S){
        String str ="";
        boolean flag=true;
        for(int i=0;i<S.length();i++){
            if(Character.isLetter(S.charAt(i))){
                if(flag){
                    str+=S.charAt(i);
                    flag=false;
                }
                
            }
            else{
                flag=true;
            }
        }
         return str;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine();
        System.out.println(check(s));
        
    }
}
