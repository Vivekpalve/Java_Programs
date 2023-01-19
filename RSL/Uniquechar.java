/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RSL;

import java.util.Arrays;

/**
 *
 * @author Lenovo
 */
public class Uniquechar {
    static boolean check(String s){
        boolean[] ch = new boolean[256];
        Arrays.fill(ch,false);
        for(int i=0;i<s.length();i++){
            if(ch[s.charAt(i)]){
                return false;
            }
            ch[s.charAt(i)]=true;
        }
        return true;
    }
    public static void main(String args[]){
        String s ="abcdefghiAjklmnopA";
        System.out.println(check(s));
    }
}
