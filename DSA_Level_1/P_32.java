/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DSA_Level_1;

/*
 **   **
**** ****
*********
 *******
  *****
   ***
    *
 */
import java.util.*;
public class P_32 {
    private static void pattern(int n){
        for(int i=1;i<=n/2;i++){
            for(int j=1;j<=2-i;j++){
                System.out.print("\t");
            }
            for(int k=1;k<=2*i;k++){
                System.out.print("*"+"\t");
            }
            for(int k=1; k<=2*(2-i+1)-1; k++){
               System.out.print("\t");
            } 
            for(int j=1; j<=2*i; j++){
               System.out.print("*"+"\t");
            } 
         System.out.println();
        }
        int t=n*2-1;
        int count=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=count;j++){
                System.out.print("\t");
            }
            for(int k=1;k<=t;k++){
                System.out.print("*"+"\t");
            }
            count++;
            t-=2;
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        pattern(n);
    }
}
