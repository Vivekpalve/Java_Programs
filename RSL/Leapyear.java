/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RSL;
import java.util.*;
/**
 *
 * @author Lenovo
 */
public class Leapyear {
    static void check(int n,int n1){
        boolean flag=false;
        if(n%4==0 || n%400==0 && n%100!=0){
            flag=true;
        }
        else{
            flag=false;
        }
        while(flag==true && n1>0){
            System.out.println(n);
            n1--;
            n+=4;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 =  sc.nextInt();
        check(n,n1);
    }
}
