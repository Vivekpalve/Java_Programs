/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RSL;

/**
 *
 * @author Lenovo
 */

public class Same_color {
    static void check(String s){
        int count2=0;
        int count1=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='G'){
                count1++;
            }else{
                
                count2++;
            }
        }
        if(count1<count2){
            System.out.println(count1);
        }
        else{
            System.out.println(count2);
        }
    }
    
    public static void main(String args[]){
        String s = "RGRGRRGR";
        check(s);
        String str = "abcd";
   // for each character present in the string
    int count = 1;
    for (int i = 0; i < str.length(); i++) {
        //comparing char to next position character
        if (i < str.length() - 1) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            }
            //if char doesn't match then print character and total count
            else {
                System.out.print(str.charAt(i) + "" + count);
                count = 1;
            }
        }
        //this condition for the last character
        else {
            System.out.println(str.charAt(i) + "" + count);
        }
    }
    }
}
