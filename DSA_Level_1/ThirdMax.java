/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DSA_Level_1;

/**
 *
 * @author Lenovo
 */
import java.util.*;
public class ThirdMax {
    static void check1(int[] A){
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        int max3=Integer.MIN_VALUE;
        
        for(int i=0;i<A.length;i++){
            if(A[i]>max1){
                max2=max1;
                max1=A[i];
            }
            else if(A[i]>max2 && A[i]!=max1){
                max3=max2;
                max2=A[i];
            }
            else if(A[i]>max3 && A[i]!=max2){
                
                max3=A[i];
            }
        }
        System.out.println(max1+" "+max2+" "+max3);
    }
    
    static void check2(int[] A){
        Arrays.sort(A);
        LinkedHashSet<Integer> l = new LinkedHashSet<>();
        for(int i :A){
            l.add(i);
        }
        System.out.println(l);
        ArrayList<Integer> ll = new ArrayList<Integer>();
        for(int i : l){
            ll.add(i);
        }
        System.out.println(ll);
        System.out.println(ll.get(ll.size()-3));
    }
    public static void main(String args[]){
        int[] A = new int[]{10, 20, 10, 30, 60, 90, 30, 20, 60};
        check1(A);
        check2(A);
    }
}
