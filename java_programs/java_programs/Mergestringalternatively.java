/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_programs;


public class Mergestringalternatively {
    static  void merge(String s1,String s2){
        int i=0,j=0,k=0;
        char[] ch1=s1.toCharArray();
        char[] ch2=s2.toCharArray();
        char[] ch3=new char[s1.length()+s2.length()];
        
        while(i<s1.length() && j<s2.length()){
            
            ch3[k++]=ch1[i++];
            ch3[k++]=ch2[j++];
        }
        for(;i<s1.length();i++){
            ch3[k++]=ch1[i];
        }
        for(;j<s2.length();j++){
            ch3[k++]=ch2[j];
        }
        for(int p=0;p<ch3.length;p++){
            System.out.print(ch3[p]+" ");
        }
        System.out.println();
        System.out.print(String.valueOf(ch3)+"\n");
    }
    public static void main(String args[]){
        
        String s1="vvkav";
        String s2="ieple";
        
        merge(s1,s2);
    }
}
