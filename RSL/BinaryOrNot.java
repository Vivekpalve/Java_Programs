/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RSL;

/**
 *
 * @author Lenovo
 */
public class BinaryOrNot {
    static void check(String s){
        boolean flag=false;
        for(int i=0;i<s.length();i++){
            
            if(s.charAt(i)=='0' || s.charAt(i)=='1'){
                flag=true;
            }  
            else{
                flag=false;
            }
        }
        if(flag){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
    public static void main(String args[]){
        
        String s ="110101010100";
        check(s);
    }
}
