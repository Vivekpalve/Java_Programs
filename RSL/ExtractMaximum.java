/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RSL;

/**
 *
 * @author Lenovo
 */
public class ExtractMaximum {
    static void check(String s){
        int sum=0;
        int max=-1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                sum=sum*10+(int)(s.charAt(i)-'0');
                if(max<sum){
                    max=sum;

                }
            }else{
                                   sum=0; 
            }
        }
        
        System.out.println(max);
    }
    public static void main(String args[]){
        
        String s ="abcdefg";
        
        check(s);
    }
            
}
