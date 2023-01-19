/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RSL;

/**
 *
 * @author Lenovo
 */
public class Sum_of_number_in_string {
    static void check(String s){
        int sum=0;
        int res=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                sum=sum*10+(int)(s.charAt(i)-'0');
            }else{
                res=sum+res;
                sum=0;
            }
        }
        res=res+sum;
         System.out.println(res);
    }
    public static void main(String args[]){
        String s = "";
        check(s);
    }
}
