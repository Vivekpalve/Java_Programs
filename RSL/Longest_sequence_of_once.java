package RSL;
public class Longest_sequence_of_once {
    static void check(String A){
        int count=0;
        int op=0;
        int start=0;
        int last=0;
        for(int i=0;i<A.length();i++){
            if(A.charAt(i)=='1'){
                count++;
                start=i;
                if(op<count){
                    op=count;
                    last=start;
                }
            }
            else{
                count=0;
            }
        }
        System.out.println(" count :"+op+" First :"+(last-op+1)+" Last :"+last);
    }
    static void check1(String A){
        
        int s =0;
        int l=0;
        int count=0;
        int t=0;
        for(int i=0;i<A.length();i++){
            if(A.charAt(i)=='1'){
                count++;
                s=i;
                if(t<count){
                    t=count;
                    l=s;
                }
                
            }
            else{
                count=0;
            }
        }
        System.out.println(t+" "+(l-t+1)+" "+l);
    }
    public static void main(String args[]){
        String A ="11111010111000";
        check(A);
        check1(A);
    }
}
