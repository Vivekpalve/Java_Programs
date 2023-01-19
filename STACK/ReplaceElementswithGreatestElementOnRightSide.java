/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package STACK;

/**
 *
 * @author Lenovo
 */
import java.util.*;
public class ReplaceElementswithGreatestElementOnRightSide {
    private static int[] great(int[] arr){
        int[] op = new int[arr.length];
        Stack<Integer> s = new Stack<Integer>();
        s.push(arr[arr.length-1]);
        op[arr.length-1]=-1;
        for(int i=arr.length-2;i>=0;i--){
            op[i]=s.peek();
            if(s.peek()<arr[i]){
                s.push(arr[i]);
            }
        }
        return op;
    }
    
    public static void main(String args[]){
        int[] arr = new int[]{17,18,5,4,6,1};
        int[] t = great(arr);
        for(int i:t){
            System.out.print(i+" ");
        }
    }
}
