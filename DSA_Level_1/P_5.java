/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DSA_Level_1;

import static DSA_Level_1.P_1.check;
import java.util.Scanner;

/*
      * 
   * * * *
 * * * * * * 
   * * * * 
      * 
*/
public class P_5 {
    static void check(int n){
        int sp = n/2;
        int s =1;
        for(int i=1;i<=n;i++){
            for(int j =1;j<=sp;j++){
                System.out.print("\t");
            }
            for(int k=1;k<=s;k++){
                System.out.print("*\t");
            }
            if(i<=n/2){
                sp--;
                s=s+2;
            }
            else{
                sp++;
                s=s-2;
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        check(n);
    }
}
