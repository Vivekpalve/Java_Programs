/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RSL;

/**
 *
 * @author Lenovo
 */
public class CodeByte1 {
    private static String check(String s){
        String s1="";
        String s2="";
        
        for(int i=0;i<s.length();i++){
            
            if(Character.isLetter(s.charAt(i))|| Character.isDigit(s.charAt(i))){
                s1=s1+s.charAt(i);
            }
            else if(s.charAt(i)==' '){
                if(s2.length()<s1.length()){
                    s2=s1;
                }
                s1="";
            }
        }
        if(s2.length()<s1.length()){
            s2=s1;
        }
        s2=s2+"u7lyhng9ce";
        System.out.println(s2);
        char[] ch = s2.toCharArray();
        
        for(int i=3;i<ch.length;i=i+4)
        {
           ch[i]='_';
        }
        String n = new String(ch);
        
        return n;
    }
    public static void main(String args[]){
        
        String s ="I love dogs";
        s = check(s);
        System.out.println(s);
    }
}
