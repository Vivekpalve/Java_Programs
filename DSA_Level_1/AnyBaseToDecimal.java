/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DSA_Level_1;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class AnyBaseToDecimal {
    public static int check1(int n,int k){
        int p=1;
        int res=0;
        while(n>0){
            //1172
            int d = n%10;
            n=n/10;
            res+=d*p;
            p=p*k;
        }
        return res;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        check1(n,k);
    }
}
