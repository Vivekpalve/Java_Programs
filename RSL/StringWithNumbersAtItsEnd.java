/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RSL;

/**
 *
 * @author Lenovo
 */
public class StringWithNumbersAtItsEnd {
    public static void main(String args[]){
        String s = "hkedeplnfm10";
        int t =0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                t=t*10+(int)(s.charAt(i)-'0');
            }
        }
        int count=0;
        for(int i=0;i<s.length()-1;i++){
            if(Character.isLetter(s.charAt(i))){
                count++;
            }
        }
        System.out.println(count);
        System.out.println(t);
    }
}
