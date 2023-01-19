package RSL;
import java.util.*;      
public class RotatedArray {
    static void reverse(int[] A,int s,int e){
        while(s<e){
            int t = A[s];
            A[s] = A[e];
            A[e] = t;
            s++;e--;
        }
    }
    public static void main(String args[]){
        int[] A = new int[]{1,2,3,4,5,6};
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        for(int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
        System.out.println();
        reverse(A,0,k-1);
        reverse(A,k,A.length-1);
        reverse(A,0,A.length-1);
        
        for(int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
        
    }
}
