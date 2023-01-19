 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_programs.Collections.HashMap;

/**
 *
 * @author Lenovo
 */
import java.util.*;
public class GetCommonElement1 {
    private static void check(int[] A1,int[] A2){
        HashMap<Integer,Integer> hm = new HashMap<>();
        
        for(int i=0;i<A1.length;i++){
            hm.put(A1[i],hm.getOrDefault(A1[i],0)+1);
        }
        for(int i=0;i<A2.length;i++){
            if(hm.containsKey(A2[i])){
                System.out.println(A2[i]);
                hm.remove(A2[i]);
            }
        }
        System.out.println(hm);
    }
    public static void main(String args[]){
        
        int[] A1 = new int[]{1,1,2,2,2,3,5};
        int[] A2 = new int[]{1,1,1,2,2,4,5};
        
        check(A1,A2);
    }
}
