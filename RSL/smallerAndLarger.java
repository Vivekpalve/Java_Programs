/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RSL;

/**
 *
 * @author Lenovo
 */
public class smallerAndLarger {
    static int[] check(int[] A,int x){
        int[] a = new int[2];
        int l=0;
        int h=A.length-1;
        int mid=0;
        while(l<=h){
            mid= l+(h-l)/2;
            if(A[mid]<=x){
                l= mid+1;
            }
            else if(A[mid]>x){
                h = mid-1;
            }
        }
        System.out.println(mid +" "+(A.length-mid));
        return a;
    }
    public static void main(String args[]){
        int[] A = new int[]{1, 2, 8, 10, 11, 12, 19};
        int[] p =check(A,0);
    }
}
