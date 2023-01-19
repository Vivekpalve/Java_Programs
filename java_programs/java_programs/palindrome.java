/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_programs;

/**
 *
 * @author Lenovo
 */
public class palindrome {
    
    static boolean check(String s){
        int i=0;
        int j=s.length()-1;
//        char[] ch =s.toCharArray();
        while(i<j){
            
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
        
    }
    public static void main(String args[]){
        
        String s="vivek";
        
        if(check(s)){
            System.out.println("is palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}
