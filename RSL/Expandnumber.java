package RSL;
public class Expandnumber {
    static void check(int num){
        String s ="";
        for(int i=10;i<num;i*=10){
            s=(num%i>0) ? " + " + num%i + s:s;
            num-=num%i;
        }
        s=num+s;
        System.out.println(s);
    }
    static void checked(int num){
        String outs = "";
        for (int i = 10; i < num; i *= 10) {
            int rem = num % i;
            outs = (rem > 0) ? " + " + rem + outs : outs;
            num -= rem;
        }
        outs = num + outs;
        System.out.println(outs);
    }
    public static void main(String args[]){
        
        int n=123456;
        check(n);
        checked(n);
    }
}