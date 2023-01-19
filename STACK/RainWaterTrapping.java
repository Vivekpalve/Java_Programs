/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package STACK;

/**
 *
 * @author Lenovo
 */
public class RainWaterTrapping {
    private static int trappingWater(int[] A){
        int[] maxL  = new int[A.length];
        int[] maxR = new int[A.length];
        
        maxL[0]=A[0];
        maxR[A.length-1]=A[A.length-1];
        
        for(int i=1;i<A.length;i++){
            maxL[i]=Math.max(maxL[i-1], A[i]);
        }
        for(int i=A.length-2;i>=0;i--){
            maxR[i]=Math.max(A[i], maxR[i+1]);
        }
//        for(int i=0;i<maxL.length;i++){
//            System.out.print(maxL[i]+" ");
//        }
//        System.out.println();
//        for(int i=0;i<maxL.length;i++){
//            System.out.print(maxR[i]+" ");
//        }
        
        int sum=0;
        for(int i=0;i<A.length;i++){
            sum+=Math.min(maxL[i], maxR[i])-A[i];
        }
        return sum;
        
    }
    public static void main(String args[]){
        int[] A = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
        
        
        int t = trappingWater(A);
        System.out.println(t);
        
    }
}
