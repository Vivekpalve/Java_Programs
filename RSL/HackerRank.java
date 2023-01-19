/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RSL;

/**
 *
 * @author Lenovo
 */
public class HackerRank {
    private static String check(String s){
        String st="";
        String str="";
        int i=0;
        while(i<s.length()-1){
            if(Character.isLowerCase(s.charAt(i))&& Character.isUpperCase(s.charAt(i+1))){
               str=str+s.charAt(i+1)+s.charAt(i)+"*";
               i=i+2;
            }
            else if(Character.isDigit(s.charAt(i))){
                str=str+0;
                st=s.charAt(i)+st;
                i=i+1;
            }
            else if(Character.isLowerCase(s.charAt(i))&& Character.isLowerCase(s.charAt(i+1))){
                str=str+s.charAt(i)+s.charAt(i+1);
                i=i+1;
            }
            else{
                
                i=i+1;
            }
        }
        String t =st+str;
        return t;
    }
    public static void main(String args[]){
        
        String s = "51Pa*0Lp*0e";
        
        String t =check(s);
        System.out.println(t);
    }
}
