/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RSL;

/**
 *
 * @author Lenovo
 */
public class Lonest_substring {
    static void maxCount(String s){
        int count=1;
        int max=1;
        int prev=s.charAt(0);
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==prev){
                count++;
                if(count>max){
                    max=count;
                }
            }
            else{
                count=1;
                prev=s.charAt(i);
            }
        }
        System.out.println(max);
    }
    public static void main(String args[]){
        String s = "abbcccddddeeeeedcba";
        
        maxCount(s);
    }
}
