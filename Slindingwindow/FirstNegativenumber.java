/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Slindingwindow;

import java.util.ArrayList;


public class FirstNegativenumber {
    public static void check(int[] arr, int k){
        // with o(n2) complexcity
        int i=0;
        int j=0;
        int k1=0;
        ArrayList<Integer> l  = new ArrayList<Integer>();
        while(j<arr.length){
            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                k1=i;
                while(k1<j){
                    if(arr[k1]<0){
                        l.add(arr[k1]);
                        break;
                    }
                    k1++;
                }
                i++;
                j++;
            }
        }
        System.out.println(l);
    }
    public static void main(String args[]){
        int arr[]= new int[]{12,1,17,8,18,30,16,28};
        
        check(arr,3);
    }
}
