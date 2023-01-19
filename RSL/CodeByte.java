
package RSL;

import static RSL.Countpalindrome.ispalindrome;

/**
 *
 * @author Lenovo
 */
public class CodeByte {
    static String check(String s){
        String str="";
        str=str+s.charAt(0);
        for(int i=1;i<s.length();i++){
            int t1=Character.getNumericValue(s.charAt(i));
            int t2=Character.getNumericValue(s.charAt(i-1));
            if(s.charAt(i)=='0'){
                str=str+s.charAt(i);
                continue;
            }
            if(t1%2==0 && t2%2==0 && t2!=0){
                str=str+"*"+t1;
            }
            else if(t1%2==1 && t2%2==1 && t2!=0){
                str=str+"-"+t1;
            }
            else{
                str=str+""+t1;
            }
        }
//        System.out.println(str);
        str=str+"u7lyhng9ce";
//        System.out.println(str);
        char[] ch = str.toCharArray();
        
        for(int i=3;i<ch.length;i=i+4)
        {
           ch[i]='_';
        }
        String n = new String(ch);
        
        return n;
    }
    public static void main(String args[]){
        
        String s = "56647304";
//        56*6*47-304
        String str =check(s);
        System.out.println(str);
    }
}
