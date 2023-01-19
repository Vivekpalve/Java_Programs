package DSA_Level_1;
import java.util.*;
public class P_14 {
    private static void pattern(int n){
        int t=n*2-1;
        int count=0;
        for(int i=n;i>=1;i--){
            for(int j=1;j<=count;j++){
                System.out.print("\t");
            }
            for(int k=1;k<=t;k++){
                System.out.print(i+"\t");
            }
            count++;
            t=t-2;
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        pattern(n);
        sc.close();
    }
}
