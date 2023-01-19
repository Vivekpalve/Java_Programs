/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_programs;

/**
 *
 * @author Lenovo
 */
public class SumOfDigitsOfStringAfterConvert {
    static int sumOfDigits(String number ,int k){
        int res=0;
        while(k>0){
            int sum = 0;
            for (int i = 0; i < number.length(); i++)
            {
                sum += Character.getNumericValue(number.charAt(i));
            }
            number=sum+"";
            res=sum;
            k--;
        }
        return res;
    }
    public static void main(String args[]){
        
        String s="iiii";
        String str="";
        for(int i=0;i<s.length();i++){
            str=str+((int)s.charAt(i)-96);
        }
        System.out.println(str);
        int ans = sumOfDigits(str,1);
        System.out.println(ans);
    }
}
