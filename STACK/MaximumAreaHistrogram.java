/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package STACK;

import java.util.*;
public class MaximumAreaHistrogram {
    private static int[] nSL(int[] arr){
        int[] op = new int[arr.length];
        Stack<Integer> s = new Stack<Integer>();
        
        for(int i=0;i<arr.length;i++){
            if(s.size()==0){
                op[i]=-1;
            }
            else if(s.size()>0 && arr[i]>arr[s.peek()]){
                op[i]=s.peek();
            }
            else if(s.size()>0 && arr[i]<=arr[s.peek()]){
                while(s.size()>0 && arr[i]<=arr[s.peek()]){
                    s.pop();
                }
                if(s.size()==0){
                    op[i]=-1;
                }
                else{
                    op[i]=s.peek();
                }
            }
            s.push(i);
        }
        
        return op;
    }
    private static int[] nSR(int[] arr){
        int[] op = new int[arr.length];
        Stack<Integer> s = new Stack<Integer>();
        
        for(int i=arr.length-1;i>=0;i--){
            if(s.size()==0){
                op[i]=arr.length;
                s.push(i);
            }
            else if(s.size()>0 && arr[i]>arr[s.peek()]){
                op[i]=s.peek();
            }
            else if(s.size()>0 && arr[i]<=arr[s.peek()]){
                while(s.size()>0 && arr[i]<=arr[s.peek()]){
                    s.pop();
                }
                if(s.size()==0){
                    op[i]=arr.length;
                }
                else{
                    op[i]=s.peek();
                }
            }
            s.push(i);
        }
        return op;
    }
    public static void main(String args[]){
        int max=0;
        int[] A = new int[]{2,1,5,6,2,3};
        int[] width = new int[A.length];
        int[] NSL = nSL(A);
        int[] NSR = nSR(A);
        
        for(int i=0;i<A.length;i++){
            width[i]=(NSR[i]-NSL[i]-1)*A[i];
            if(max<width[i]){
                max=width[i];
            }
        }
        System.out.println("NSR");
        System.out.println(Arrays.toString(NSR));
        System.out.println("NSL");
        System.out.println(Arrays.toString(NSL));
        System.out.println("Maximum area of Histogram");
        System.out.println(max);
    }
}
