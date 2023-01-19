/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BinarySearch;

import java.util.Arrays;

/**
 *
 * @author Lenovo
 */
import java.util.*;
public class Congo_3 {
    static void check(int[] a,int n){
        HashMap<Integer,Integer> l = new HashMap<>();
        ArrayList<Integer> ll = new ArrayList<>();
        for(int i : a){
            l.put(i, l.getOrDefault(i,0)+1);
        }
        for(int i : l.keySet()){
            ll.add(i);
        }
        System.out.print(ll);
        System.out.print(l);
    }
    public static void main(String args[]){
        int n=10;
        int a[]={1,2,2,3,45,56,67,89,90,23};
        int as=5;
        
//        Arrays.sort(a);
//        for(int i=0;i<n;i++)
//        {
//            System.out.print(a[i]+" ");
//        }
//        int count=0;
//        for(int i=n-1;i>0;i--)
//        {
//            if(a[i-1]!=a[i])
//            {
//                count++;
//            }
//            if(count==as)
//            {
//                System.out.println(a[i]);
//                return ;
//            }
//        }
         check(a,as);
      
    }
}
