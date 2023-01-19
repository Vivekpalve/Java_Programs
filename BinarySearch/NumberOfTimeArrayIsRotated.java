/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BinarySearch;

/**
 *
 * @author Lenovo
 */
public class NumberOfTimeArrayIsRotated {
    
    private static int check(int[] A){
        int n = A.length-1;
        int l=0;
        int h=n;
        while(l<=h){
            int mid = l+(h-l)/2;
//            int prev = (mid+n-1)%n;
//            int next = (mid+1)%n;
            
            if(A[mid] > A[mid -1] && A[mid] > A[mid + 1]){
                return mid+1;
            }
            else if(A[l]<=A[mid]){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return -1;
    } 
    public static void main(String args[]){
        
        int[] A = new int[]{11,12,15,18,2,5,6,8};
        
        int t = check(A);
        System.out.println(t);
    }
}
//without binarySearch and o(n)
//for(int i=0;i<A.length-1;i++){
//            if(A[i]>A[i+1]){
//                return A.length-i-1;
//            }
//        }