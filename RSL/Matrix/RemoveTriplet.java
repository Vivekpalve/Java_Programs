/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matrix;

/**
 *
 * @author Lenovo
 */
import java.util.*;
public class RemoveTriplet {
    static void check(int[] nums){
        LinkedHashMap<Integer,Integer> hm = new LinkedHashMap<>();
        ArrayList<Integer> l = new ArrayList<>();
        for(int i :nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        System.out.println(hm);
        for(Map.Entry<Integer,Integer> e : hm.entrySet()){
            int t = Math.abs(e.getValue()-3);
            
        }
    }
    public static void main(String args[]){
        int[] A = new int[]{2,4,2,2,7,5,6,7,8,6,6,2,6,7,6};
        check(A);
//        for(int i : t){
//            System.out.print(i+" ");
//        }
    }
}
