/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package STACK;

import java.util.Stack;

public class NearestSmallerToLeft {
    private static void check(int[] A){
        Stack<Integer> s = new Stack<>();
        int[] op = new int[A.length];
        int index=0;
        for(int i=0;i<A.length;i++){
            if(s.size()==0){
                op[index]=-1;
            }
            else if( s.size()>0 && s.peek()<A[i]){
                op[index]=s.peek();
            }
            else if(s.size()>0 && s.peek()>=A[i]){
                while(s.size()>0 && s.peek()>=A[i]){
                    s.pop();
                }
                if(s.size()==0){
                    op[index]=-1;
                }
                else{
                    op[index]=s.peek();
                }
            }
            s.push(A[i]);
            index++;
        }
        for(int i=0;i<op.length;i++){
            System.out.print(op[i]+" "); 
        }
    }
    public static void main(String args[]){
        int[] A = new int[]{1 ,5 ,0 ,3 ,4 ,5};
        
        check(A);
    }
}
