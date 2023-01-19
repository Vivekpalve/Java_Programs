
package java_programs;
//import java.util.*;
public class Countingwords {
    public int countWordsDirectly(String s) {
        int countwords = 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                countwords++;
            }
        }

        return countwords;
    }

    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for (int i = 0; i < sentences.length; i++) {
            int val = countWordsDirectly(sentences[i]);
            if (val > max) {
                max = val;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        String[] sentences =new String[]{"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
		Countingwords s =new Countingwords();
		 int n=s.mostWordsFound(sentences);
		 System.out.println(n);
    }
}
