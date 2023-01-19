/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Slindingwindow;

/**
 *
 * @author Lenovo
 */
import java.util.*;
public class LargestSubarrayOfSumK {
    static int check(int[] A ,int k ){
        int max=0;
        int sum=0;
        HashMap<Integer,Integer> hm  =new HashMap<>();
        for(int i=0;i<A.length;i++){
            sum+=A[i];
            if(hm.containsKey(sum-k)){
                if((i-hm.get(sum-k))+1>max){
                    max = ((i-hm.get(sum-k))+1);
                }
            }
            if(!hm.containsKey(sum)){
                hm.put(sum, i+1);
            }
            
        }
        
        
        
        
        return max;
    }
    public static void main(String args[]){
        
        int[] A = new int[]{10, 5, 2, 7, 1,2, 9,5, 2, 7, 1,1,1};
        int k=17;
       int t = check(A,k);
       System.out.println(t);
    }
}
