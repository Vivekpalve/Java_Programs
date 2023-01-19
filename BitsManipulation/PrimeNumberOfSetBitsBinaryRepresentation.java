/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BitsManipulation;

/**
 *
 * @author Lenovo
 */
import java.util.*;
public class PrimeNumberOfSetBitsBinaryRepresentation {
    static boolean isPrime(int n){
        for(int i=n-1;i>1;i--){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static int countPrimeSetBits(int left, int right) {
        int c=0;
        for(int i=left;i<=right;i++){
            int count=0;
            while(i!=0){
                count++;
                int r = i & -i;
                i=i-r;
            }
            if(isPrime(count)){
                c++;
            }
        }
        return c;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int left = sc.nextInt();
        int right = sc.nextInt();
        int t = countPrimeSetBits(left,right);
        System.out.println(t);
    }
}
