package RSL;
import java.util.Scanner;
public class ReverseRecursively {
    static void reverse(int num){
                if(num<10){
                    System.out.print(num);
                }else{
                    System.out.print(num%10);
                    reverse(num/10);
                }
                System.out.println();
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        reverse(n);
    }
}
