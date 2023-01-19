/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DSA_Level_1;

/*
* * * * * * 
 * * * * * 
  * * * * 
   * * * 
    * * 
     * 
     * 
    * * 
   * * * 
  * * * * 
 * * * * * 
* * * * * * 
 */
import java.util.*;
public class P_34 {
    private static void pattern(int n){
        int count=0;
        for(int i=n;i>=1;i--){
            for(int k=1;k<=count;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            count++;
            System.out.println();
        }
        count=n-1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=count;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*"+" ");
            }
            count--;
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern(n);
    }
}
