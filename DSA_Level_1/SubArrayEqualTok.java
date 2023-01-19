/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DSA_Level_1;

/**
 *
 * @author Lenovo
 */
public class SubArrayEqualTok {
    static void check(int[] arr,int required){
        int sum=0;
        int N = arr.length;
        for (int i = 0; i < N; i++) {
           sum = arr[i];
            for (int j = i + 1; j <= N; j++) {
                if (sum == required) {
                    System.out.println(i+" "+(j-1));
                    return;
                }
                if (sum > required || j == N)
                    break;
                sum = sum + arr[j];
            }
        } 
    }
    public static void main(String args[]){
        int[] A = new int[]{23,2,4,6,7};
        
        check(A,13);
    }
}
