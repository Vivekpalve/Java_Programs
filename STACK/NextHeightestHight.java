
package STACK;
import java.util.*;
public class NextHeightestHight {
    static void check(int[] A){
        Stack<Integer> s = new Stack<>();
        int[] op = new int[A.length];
        int index =A.length-2;
        op[A.length-1] =-1;
        s.push(A.length-1);
        for(int i=A.length-2;i>=0;i--){
            if(s.isEmpty()){
                op[index]= -1;
            }
            else if(!s.isEmpty() && A[s.peek()]>A[i]){
                op[index] = s.peek()-i;
            }
            else if(!s.isEmpty() && A[s.peek()]<A[i]){
                while(!s.isEmpty() && A[s.peek()]<A[i]){
                    s.pop();
                }
                if(s.isEmpty()){
                    op[index] = -1;
                }
                else{
                    op[index] = s.peek()-i;
                }
            }
            s.push(i);
            index--;
        }
        for(int i=0;i<op.length;i++){
            System.out.print(op[i]+" ");
        }
    }
    public static void main(String args[]){
        int[] A = new int[]{21,11,6,19};
        
        check(A);
    }
}
