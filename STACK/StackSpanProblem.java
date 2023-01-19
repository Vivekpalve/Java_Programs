/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package STACK;

import java.util.Stack;

/**
 *
 * @author Lenovo
 */
public class StackSpanProblem {
    
    private static int[] check(int[] A){
        int[] op = new int[A.length];
        Stack<Integer> s = new Stack<Integer>();
        
        s.push(0);
        op[0]=1;
        for(int i=1;i<A.length;i++){
            
            
            while(!s.isEmpty() && A[i]>=A[s.peek()]){
                s.pop();
                
            }
            if(s.size()==0){
                op[i]=i+1;
            }
            else{
                op[i]=i-s.peek();
            }
            s.push(i);
        }
        return op;
    }
    public static void main(String args[]){
        
        int[] A = new int[]{100,80,60,70,60,75,85};
        
        int[] t = check(A);
        for(int i=0;i<t.length;i++){
            System.out.print(t[i]+" ");
        }
    }
}
