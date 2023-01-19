/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_programs;

/**
 *
 * @author Lenovo
 */
public class Nextgreater {
     public int[] nextGreaterElement(int[] nums1, int[] nums2) {
       int n1=nums1.length;
        int n2=nums2.length;
        int[] A =new int[n1];
        for(int i=0;i<n1;i++){
            int max=-1;
            for(int j=0;j<n2;j++){
                if(nums1[i]==nums2[j]){
                    if(j!=n2-1 && nums2[j+1]>nums2[j]){
                        max=nums2[j+1];
                        break;
                    }
                }
            }
            A[i]=max;
        }
        return A;
    }
     public static void main(String args[]){
         
     }
}
