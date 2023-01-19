
package RSL;
import java.util.*;
public class Reverse_words {
    static String swap(String str, int i, int j)
    {
        StringBuilder sb = new StringBuilder(str);
        sb.setCharAt(i, str.charAt(j));
        sb.setCharAt(j, str.charAt(i));
        return sb.toString();
    }
    static void check(String s){
        
        int sp=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='.' || i==s.length()-1){
                int e;
                if(i==s.length()-1){
                    e=i;
                }
                else{
                    e=i-1;
                }
                while(sp<e){
                    s=swap(s,sp,e);
                    sp++;
                    e--;
                }
                sp=i+1;
            }
        }
        System.out.println(s);
    }
    public static void main(String args[]){
        
        String s ="omkar.place.in.google";
        check(s);
    }
}
