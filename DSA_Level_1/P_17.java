/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DSA_Level_1;

/*
				1	
			1	2	3	
		1	2	3	4	5	
	1	2	3	4	5	6	7	
1	2	3	4	5	6	7	8	9	
 */
import java.util.*;
public class P_17 {
    private static void pattern(int n){
        int t =1;
        int count=n-1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=count;j++){
                System.out.print("\t");
            }
            for(int k=1;k<=t;k++){
                System.out.print(k+"\t");
            }
            t+=2;
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
