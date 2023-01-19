/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_programs.array_programs;

import java.util.Arrays;

/**
 *
 * @author Lenovo
 */
public class Replace_each_element_by_its_rank {
    
    static void replace(int[] A){
        int newArray[] = Arrays.copyOfRange(A, 0, A.length);
        Arrays.sort(newArray);
        int i;
    }
    public static void main(String args[]){
        int[] arr = { 100, 2, 70, 12, 90 };
        replace(arr);
    }
}
