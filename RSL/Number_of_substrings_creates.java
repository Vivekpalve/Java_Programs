/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RSL;

/**
 *
 * @author Lenovo
 */
public class Number_of_substrings_creates {
    static void checkSub(String s){
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                count++;
            }
            else{
                continue;
            }
        }
        System.out.println(count*(count-1)/2);
    }
    public static void main(String args[]){
        String s = "1111";
        checkSub(s);
    }
}
