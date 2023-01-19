package DSA_Level_1;
import java.util.*;
public class RotateArray {
    static void reverse(int[] arr,int st,int end){
        while(st<end){
            int t=arr[st];
            arr[st]=arr[end];
            arr[end]=t;
            st++;
            end--;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter size of array:");
        int n  = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Entet the array element");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter 0 for left rotate or 1 for right rotate of array");
        int d = sc.nextInt();
        
        System.out.println("Enter the number to shift array by that number:");
        int p = sc.nextInt();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        if(d==0){
            reverse(arr,0,p-1);
            reverse(arr,p,arr.length-1);
            reverse(arr,0,arr.length-1);
        }
        else{
           reverse(arr, 0, arr.length - p - 1);
           reverse(arr, arr.length - p, arr.length - 1);
           reverse(arr, 0, arr.length - 1);
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
