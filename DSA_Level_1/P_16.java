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
public class P_16 {
    public static void pattern(int n){
        int count=n-1;
        for(int i=1;i<=n;i++){
            for(int k=1;k<=count;k++){
                System.out.print("\t");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i+"\t");
            }
            count--;
            System.out.println();
        }
        count=1;
        for(int i=n-1;i>=1;i--){
            for(int j=1;j<=count;j++){
                System.out.print("\t");
            }
            for(int k=i;k>=1;k--){
                System.out.print(i+"\t");
            }
            count++;
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern(n);
    }
}
