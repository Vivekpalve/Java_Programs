/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RSL;

/**
 *
 * @author Lenovo
 */
public class Reverse {
    static void reversed(String s){
        int i=0;
        int j=s.length()-1;
        StringBuilder sb = new StringBuilder(s);
        while(i<j){
            
            sb.setCharAt(i, s.charAt(j));
            sb.setCharAt(j, s.charAt(i));
            i++;
            j--;
        }
        System.out.println(sb.toString());
    }
    public static void main(String args[]){
        reversed("vivek");
    }
}
