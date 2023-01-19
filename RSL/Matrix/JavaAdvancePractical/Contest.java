/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Contest
{
    static void check(String s){
        int[] ch = new int[26];
        for(int i=0;i<s.length();i++){
            ch[s.charAt(i) - 'a']++;
        } 
        for(int i=0;i<ch.length;i++){
            System.out.print(ch[i]+" ");
        }
        int sum=0;
        for(int i=0;i<ch.length;i++){
            if(ch[i]==0){
                sum+=i+1;
            }
        }
        System.out.println(sum);
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc= new Scanner(System.in);
//		int t = sc.nextInt();
//		for(int j=0;j<t;j++){
		    int[] arr= new int[26];
		    for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt(); 
			}
		    String s = sc.next();
		    check(s);
//		}
	}
}
