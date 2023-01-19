/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DSA_Level_1;

import java.util.Scanner;

/*
1	
1	2	
1	2	3	
1	2	3	4	
1	2	3	4	5	
1	2	3	4	
1	2	3	
1	2	
1	
 */
public class P_19 {
    private static void pattern(int n){
        int t=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=t;j++){
                System.out.print(j+"\t");
            }
            System.out.println();
            t++;
        }
        t=n-1;
        for(int i=n-1;i>=1;i--){
            for(int j=1;j<=t;j++){
                System.out.print(j+"\t");
            }
            System.out.println();
            t--;
        }
    }
    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern(n);   
    }
}
