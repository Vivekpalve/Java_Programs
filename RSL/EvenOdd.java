
package RSL;


public class EvenOdd {
    static String check(int A[]){
        
        int ce=0;
        int co=0;
        for(int i=0;i<A.length;i++){
            if(A[i]%2==0){
                ce++;
            }
            else{
                co++;
            }
        }
        if(ce%2==0 && co%2==1){
            return "YES";
        }
        return "NO";
    }
    public static void main(String args[]){
        int[] A = new int[]{5,6,7,8,9};
        String s = check(A);
        System.out.println(s);
    }
}
