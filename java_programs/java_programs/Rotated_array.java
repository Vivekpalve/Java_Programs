/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_programs;

/**
 *
 * @author Lenovo
 */
public class Rotated_array {
    
    public static int search(int[] nums,int t){
        int l=0;
        int h=nums.length-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(nums[mid]==t){
                return t;
            }
            if(nums[l]<=nums[mid]){
                if(t>=nums[l] && t<=nums[mid]){
                    h=mid-1;
                }
                else{
                    l=mid+1;
                }
            }
            else{
                if(t>=nums[mid] && t<=nums[h]){
                    l=mid+1;
                }
                else{
                    h=mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int[] nums ={20,30,40,50,60,5,10};
        int t=5;
        int c=search(nums,t);
        
        if(c==-1){
            System.out.println("element not found");
            
        }else{
            System.out.println(" element found at :"+c);
        }
        
    }
}
