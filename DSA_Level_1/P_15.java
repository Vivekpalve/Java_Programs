/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DSA_Level_1;

/*
1	
2	2	
3	3	3	
4	4	4	4	
5	5	5	5	5	
4	4	4	4	
3	3	3	
2	2	
1	
 */
import java.util.*;
public class P_15 {
    private static void pattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+"\t");
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print(i+"\t");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern(n);
    }
}
