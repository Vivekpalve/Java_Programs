/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matrix;

/**
 *
 * @author Lenovo
 */
public class MaximumLengthWord {
    static String check(String s){
        String[] t = s.split(" ");
        int max =0;
        String p="";
        for(String s1 : t){
            if(s1.length()>max){
                p=s1;
                max= s1.length();
            }
           
        }
        return p;
    }
    
    public static void check1(String s)
    {
        int p=0;
        int  mx=0;
        String as="",aa="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
               if(p>mx)
               {
                   as=aa;
                   mx=p;                  
               }
               p=0;
               aa="";
            }
            else
            {
                aa+=s.charAt(i);
                p++;
            }
        }
         if(p>mx)
         {
            as=aa;
            mx=p;
         }
        System.out.println(mx);
        System.out.println(as);
    }
    public static void main(String args[]){
        String s ="what is your name Maharastra H";
        System.out.println(check(s));
        System.out.println();
        check1(s);
    }
}
