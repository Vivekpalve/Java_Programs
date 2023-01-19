
package java_programs;

/**
 *
 * @author Lenovo
 */
import java.util.*;
public class NumberPyramid {
    
    static void numberPyramid(int n){
        int left=1;
        int right=0;
        int j;
        int count=n-1;
        
        for(int i=1;i<=n;i++){
            for(int k=1;k<=count;k++){
                System.out.print(" ");
            }
            for(j=i;j<=left;j++){
                System.out.print(j);
            }
            left+=2;
            if(i!=1){
                for(j=right;j>=i;j--){
                    System.out.print(j);
                }
            }
            right+=2;
            System.out.print("\n");
            count--;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int n=sc.nextInt();
        
        numberPyramid(n);
    }
}
