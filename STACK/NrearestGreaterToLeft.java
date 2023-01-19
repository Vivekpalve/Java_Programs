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
public class NrearestGreaterToLeft {
    private static int[] check(int[] A){
        
        int[] op = new int[A.length];
        int index=0;
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<A.length;i++){
            if(s.isEmpty()){
                op[index]=-1;
            }
            else if(!s.isEmpty() && A[i]<=s.peek()){
                op[index]=s.peek();
            }
            else if(!s.isEmpty() && A[i]>=s.peek()){
                while(!s.isEmpty() && A[i]>=s.peek()){
                    s.pop();
                }
                if(s.isEmpty()){
                    op[index]=-1;
                }
                else{
                    op[index]=s.peek();
                }
            }
            index++;
            s.push(A[i]);
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
