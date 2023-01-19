/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_programs.array_programs;

import java.util.*;

/**
 *
 * @author Lenovo
 */
public class Count_distinct_element {
    
    static void countDistinct(int[] A,int n){
        Set<Integer> s = new HashSet<>();
        
        for(int i:A){
            s.add(i);
        }
        System.out.println(s.size());
    }
    public static void main(String args[]){
        int A[] = new int[]{10, 30, 40, 20, 10, 20, 50, 10};
        countDistinct(A,A.length);
    }
}
