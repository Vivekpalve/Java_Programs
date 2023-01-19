/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_programs;

/**
 *
 * @author Lenovo
 */
import java.util.*;
public class SortArrayoneloop {
    static void sort(int[] A){
        for(int j=0;j<A.length-1;j++){
            if(A[j]>A[j+1]){
                int t=A[j];
                A[j]=A[j+1];
                A[j+1]=t;
                
                j=-1;
            }
            
        }
    }
//    static char[] sortString(char[] ch){
//        
//        for(int i=0;i<ch.length-1;i++){
//            if(ch[i]>ch[i+1]){
//                char t = ch[i];
//                ch[i] = ch[i+1];
//                ch[i]=t;
//                
//                i=-1;
//            }
//        }
//        return ch;
//    }
    public static void main(String args[]){
        int[] A={0,1,0,1,1,1};
        
        sort(A);
        
        for(int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
        System.out.println();
        String s="zyxwvudcba";
        char[] ch = s.toCharArray();
//        char[]ch1 =sortString(ch);
//        System.out.print(Arrays.toString(ch));
    }
}
