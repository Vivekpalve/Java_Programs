
package java_programs.array_programs;

import java.util.Arrays;
public class First_half_Ascending_order_second_half_descending_order {
    static void sort(int[] A,int mid,int h){
        
        while(mid<h){
            int t = A[mid];
            A[mid]= A[h];
            A[h] =t;
            mid++;
            h--;
        }
    }
    public static void main(String args[]){
        int[] A = {1, 90, 34, 89, 7, 9};
        
        for(int i=0;i<A.length-1;i++){
            if(A[i]>A[i+1]){
                int t=A[i];
                A[i]= A[i+1];
                A[i+1]=t;
                i=-1;
            }
        }
        int l=0;
        int h=A.length-1;
        System.out.println(h);
        int mid = (l+h)/2;
        System.out.println(mid);
        sort(A,mid+1,h);
        for(int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
    }
}
