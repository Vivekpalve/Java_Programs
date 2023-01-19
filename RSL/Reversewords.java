/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RSL;

/**
 *
 * @author Lenovo
 */
public class Reversewords {
    static void check(String s){
        String[] str = s.split("\\.");
        int i=0;
        int j=str.length-1;
        while(i<j){
            String sp =str[i];
            str[i] = str[j];
            str[j] =sp;
            i++;
            j--;
        }
        String ans = String.join(".", str);
        System.out.println(ans);
    }
    static void checked(String s){
        
        StringBuilder sb = new StringBuilder();
        int end=s.length()-1;
        int sp=s.length();
        for(int i=s.length()-1;i>0;i--){
            
            if(s.charAt(i)=='.' || i==0){
                if(i==0){
                    sp=i;
                }
                else{
                    sp=i+1;
                }
                sb.append(s.substring(sp, end+1)).append(".");
                end=i-1;
            }
            
        }
        sb.append(s.substring(0, end+1));
        System.out.println(sb.toString());
    }
    public static void main(String args[]){
        String s = "hifff.my.name.is.vivek.palve";
        
        check(s);
        checked(s);
    }
}
