/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DSA_Level_1;

/**
 *
 * @author Lenovo
 */
import java.util.*;
/*
      1
    2 2 2
  3 3 3 3 3
4 4 4 4 4 4 4
*/
public class P_13 {
    private static void pattern(int n){
        int t=1;
        int count=n-1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=count;j++){
                System.out.print("\t");
            }
            for(int k=1;k<=t;k++){
                System.out.print(i+"\t");
            }
            System.out.println();
            count--;
            t+=2;
        }
    }
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        pattern(n);
    }
}
