package RSL;
import java.util.Arrays;
public class MinimumRemovals {
    static int check(int[] A){
        Arrays.sort(A);
        
        int count=0;
        System.out.println(A[A.length-2]);
        for(int i=0;i<=A.length-2;i++){
            if((A[A.length-2]-A[i])>=4){
                count++;
            }
        }
        return count;
    }
    public static void main(String args[]){
        int[] A = new int[]{5,6,8,10,4,9,7};
        
        int n=check(A);
        System.out.println(n);
        
    }
}
