/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RSL;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Uptosingledigit {
    static void check(int n){
        int sum=0;
        
        while(n>0){
            int r=n%10;
            sum+=r;
            n=n/10;
        }
        if(sum<10){
            System.out.println(sum);
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
/*
12345=1+2+3+4+5=15
15=1+5=6
*/