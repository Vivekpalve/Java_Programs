/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DSA_Level_1;

/*
				        1	
				1	2	1	
			1	2	3	2	1	
		1	2	3	4	3	2	1	
	1	2	3	4	5	4	3	2	1	
1	2	3	4	5	6	5	4	3	2	1	
 */
import java.util.*;
public class P_21 {
    private static void pattern(int n){
        int count=n-1;
        int t1=1;
        int t2=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=count;j++){
                System.out.print("\t");
            }
            for(int w=1;w<=t1;w++){
                System.out.print(w+"\t");
            }
            for(int k=t2-1;k>=1;k--){
                System.out.print(k+"\t");
            }
            t1++;
            t2++;
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
