/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BitsManipulation;

/*
start= 10;
goal=7
we have to convert start to goal
 */
import java.util.*;
public class MinimumBitFlipsToConvertNumber {
    public static int bitFlip(int s ,int g){
        int count=0;
        int t = s^g;
        while(t!=0){
            count++;
            int r = t & -t;
            t=t-r;
        }
        return count;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int goal= sc.nextInt();
        int n = bitFlip(start ,goal);
        System.out.println(n);
        
        
        
    }
}
