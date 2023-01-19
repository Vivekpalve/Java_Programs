/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DSA_Level_1;

/**
 *
 * @author Lenovo
 */
//import java.util.*;
public class Tiaa {
    static public int check(char[] a,char[] b,int c){
        int misscount=0;
        int scount=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==b[i]){
                scount++;
            }
            else{
                misscount++;
            }
        }
        if(a.length==scount){
            return 1;
        }
        if(misscount<c){
            return 2;
        }
        if(misscount==c){
            return 3;
        }
        return 4;
    }
    
    static public void main(String args[]){
        char[] ch1 = new char[]{'h','e','l','l','o'};
        char[] ch2 = new char[]{'h','e','l','l','o'};
        int t =check(ch1,ch2,4);
        System.out.println(t);
    }
}
