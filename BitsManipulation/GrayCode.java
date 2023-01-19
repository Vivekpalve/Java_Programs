/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BitsManipulation;

/**
 *
 * @author Lenovo
 */
import java.util.*;
public class GrayCode {
    public static ArrayList<String> solution(int n){
        if(n==1){
            ArrayList<String> l = new ArrayList<>();
            l.add("0");
            l.add("1");
            return l;
        }
        ArrayList<String> l1 = solution(n-1); 
        ArrayList<String> l2 = new ArrayList<>();
        
        for(int i=0;i<l1.size();i++){
            String r = l1.get(i);
            l2.add("0"+r);
        }
        for(int i=l1.size()-1;i>=0;i--){
            String r= l1.get(i);
            l2.add("1"+r);
        }
        
        return l2;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        
        ArrayList<String> t= solution(n);
        System.out.println(t);
        System.out.println(t.size());
    }
}
