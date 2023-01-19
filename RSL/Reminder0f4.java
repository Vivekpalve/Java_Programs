/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RSL;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public class Reminder0f4 {
    static void check(int[] A){
        List<Integer> l = new ArrayList<Integer>();
        for(int i=0;i<A.length;i++){
            if(A[i]%5==4){
                l.add(A[i]);
            }
        }
        for(int i=0;i<l.size();i++){
            System.out.print(l.get(i)+" ");
        }
    }
    public static void main(String args[]){
        int[] A = new int[]{19,10,44,3,11,129};
        
        check(A);
    }
}
