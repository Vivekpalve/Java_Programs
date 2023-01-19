/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DSA_Level_1;

/*
555555555
4444 4444
333   333
22     22
1       1
 */
import java.util.*;
public class P_30 {
    private static void pattern(int n){
        int count=1;
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            if(i!=n){
                for(int k=1;k<=count;k++){
                  System.out.print(" ");
                }
                count+=2;
            }
            
            
            for(int w=1;w<=i;w++){
                if(w!=n){
                    System.out.print(i);
                }
                
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
