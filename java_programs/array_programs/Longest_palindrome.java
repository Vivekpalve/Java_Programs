/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_programs.array_programs;

/**
 *
 * @author Lenovo
 */
public class Longest_palindrome {
    static boolean check(int p){
        int sum=0;
        int p1=p;
        while(p1!=0){
            sum=sum*10+p1%10;
            p1/=10;
        }
        if(sum==p){
            return true;
        }
        return false;
    }
    static int palindrome(int[] A,int n){
        
        for(int i=n-1;i>0;i--){
            if(check(A[i])){
                return A[i];
            }
        }
        return 0;
    }
    public static void main(String args[]){
        
        int[] A = { 121, 2322, 54545, 999990 };
        System.out.println(palindrome(A,A.length));
    }
}
