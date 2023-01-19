package RSL;
public class Infosys {
    static int check(int n){
        
        long sum=1;
        long[] A = new long[n];
        
        for(int i=1;i<n;i++){
            sum=sum*i;
            A[i]=sum;
        }
        for(int i=1;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
        for(int i=n-1;i>=1;i--){
            if(A[i]%n==1){
                return (int)i%1000000007;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int n = 7;
        
        int t = check(n);
        System.out.println(t);
    }
}
