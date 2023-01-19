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
public class Demo {
    static int[] stackSpamProblem(int[] A){
        int[] op = new int[A.length];
        Stack<Integer> s = new Stack<Integer>();
        s.push(0);
        op[0]=1;
        for(int i=1;i<A.length;i++){
            while(s.size()>0 && A[i]>=A[s.peek()]){
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
    static int[] nearestsmallerToLeft(int[] A){
        int[] op = new int[A.length];
        int index=0;
        Stack<Integer> s = new Stack<Integer>();
        for(int i=0;i<A.length;i++){
            if(s.size()==0){
                op[index]=-1;
            }
            else if(s.size()>0 && s.peek()<A[i]){
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
        return op;
    }
    static int[] nearestGreaterToRight(int[] A ){
        Stack<Integer> s = new Stack<Integer>();
        int[] op = new int[A.length];
        int index=A.length-1;
        for(int i=A.length-1;i>=0;i--){
            if(s.size()==0){
                op[index]=-1;
            }
            else if(s.size()>0 && s.peek()>A[i]){
                 op[index]=s.peek();
            }
            else if(s.size()>0 && s.peek()<=A[i]){
                while(s.size()>0 && s.peek()<=A[i]){
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
            index--;
        }
        return op;
    }
    public static void main(String args[]){
        int[] A  = new int[]{1,3,2,4,5};
        int[] a=nearestGreaterToRight(A);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        int[] A1  = new int[]{4,5,2,10,8};
        int[] t =nearestsmallerToLeft(A1);
        for(int i=0;i<t.length;i++){
            System.out.print(t[i]+" ");
        }
        int[] A2 = new int[]{100,80,60,70,60,75,85};
        int[] t1 =stackSpamProblem(A2);
        System.out.println();
        for(int i=0;i<t1.length;i++){
            System.out.print(t1[i]+" ");
        }
    }
}
