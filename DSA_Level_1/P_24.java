/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DSA_Level_1;

/*
1	
2	7	
3	8	12	
4	9	13	16	
5	10	14	17	19	
6	11	15	18	20	21	  
 */
import java.util.*;
public class P_24 {
    private static void pattern(int n){
        for(int i=1;i<=n;i++){
            int diff=n-1;
            int k=i;
            for(int j=1;j<=i;j++){
                System.out.print(k+"\t");
                k+=diff;
                diff--;
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        pattern(n);
    }
}
