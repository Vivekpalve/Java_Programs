/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DSA_Level_1;

import static DSA_Level_1.P_4.check;
import java.util.Scanner;

/*


*  *  * *  *  *
*  *       *  *
*             *
*  *       *  *
*  *  * *  *  *


*/
public class P_6 {
    static void check(int n){
        int s = n/2+1;
        int sp=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=s;j++){
                System.out.print("*\t");
            }
            for(int j=1;j<=sp;j++){
                System.out.print("\t");
            }
            for(int j=1;j<=s;j++){
                System.out.print("*\t");
            }
            if(i<=n/2){
                s--;
                sp=sp+2;
            }
            else{
                sp=sp-2;
                s++;
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
