/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DSA_Level_1;

/*
1	
2	1	
3	2	1	
4	3	2	1	
5	4	3	2	1	
 */
import java.util.*;
public class P_22 {
    private static void pattern(int n){
        int t=1;
        for(int i=1;i<=n;i++){
            for(int j=t;j>=1;j--){
                System.out.print(j+"\t");
            }
            t++;
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern(n);
    }
}
