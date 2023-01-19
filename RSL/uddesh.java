/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RSL;

/**
 *
 * @author Lenovo
 */
public class uddesh {
    static int[] check(int[] A ,int k){
        int[] A1 = new int[A.length-k+1];
        int i=0;
        int j=0;
        int k1=0;
        int sum=0;
        while(j<A.length){
            sum+=A[j];
            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                A1[k1++]=sum;
                sum-=A[i];
                i++;
                j++;
            }
        }
        return A1;
    }
    public static void main(String args[]){
        int[] A = new int[]{1,2,3,4,5,6};
        
        int k=3;
        int[] t = check(A,k);
        for(int i=0;i<t.length;i++){
            System.out.print(t[i]);
        }
    }
}
