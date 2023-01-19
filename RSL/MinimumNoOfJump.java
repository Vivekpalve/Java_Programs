/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RSL;
public class MinimumNoOfJump {
    static boolean jump(int[] A){
        int count=0;
        int n=A.length;
        int i=0;
        for(i=0;i<A.length-1;i++){
            if(A[i]<A[i+1] && i!=n){
                count++;
            }
            else if(A[i]>A[i+1] && i!=n){
                i=i+A[i];
                count++;
            }
        }
        if(i==n){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        int[] A=new int[]{3,2,1,0,4};
        boolean b = jump(A);
        System.out.println(b);
    }
}
