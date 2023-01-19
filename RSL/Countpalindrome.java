/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RSL;

/**
 *
 * @author Lenovo
 */
public class Countpalindrome {
    static boolean ispalindrome(String s,int i,int j){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    static void check(String s){
        int start=0;
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' ' || i==s.length()-1){
                int end;
                if(i==s.length()-1){
                    end=i;
                }
                else{
                    end=i-1;
                }
                if(ispalindrome(s,start,end)){
                    
                    count++;
//                    System.out.println(s.charAt(start));
//                    System.out.println(s.charAt(end));
                }
                start=i+1;
            }
        }
        System.out.println(count);
    }
    public static void main(String args[]){
        
        String s ="nitin and nitin and I are good friends";
        
        check(s);
    }
    
}
