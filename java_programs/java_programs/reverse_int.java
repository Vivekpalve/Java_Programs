/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_programs;


public class reverse_int {
    public static void main(String args[]){
        int A =234234;
        int sum=0;
        while(A>0){
            int r=A%10;
            sum=sum*10+r;
            A/=10;
        }
        System.out.println(sum);
    }
}
