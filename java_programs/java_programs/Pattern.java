/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_programs;

/**
 *
 * @author Lenovo
 */
public class Pattern {
    public static void main(String args[]){
        int n=3;
        int m=n;
        for(int i=1;i<=n;i++){
            for(int j=n;j>=1;j--){
                int c=m;
                while(c>0){
                    System.out.print(j+" ");
                    c--;
                }
            }
            m--;
            System.out.print("$");
        }
    }
}
//for N = 3 the pattern will be 
//3 3 3 2 2 2 1 1 1
//for(int i=n;i>=1;i--){
//            int c=n;
//            while(c>0){
//                System.out.print(i+" ");
//                c--;
//            }
//        }
//3 3 2 2 1 1
//3 2 1
