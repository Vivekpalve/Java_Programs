/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RSL;

/**
 *
 * @author Lenovo
 */
import java.util.*;
public class Untilsingledigit {
    static void check(int n){
        int sum=0;
        while(n!=0){
            sum=sum+n%10;
            n/=10;
        }
        if(sum<10){
            System.out.println(sum);
            return;
        }else{
            check(sum);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        check(n);
    }
}
