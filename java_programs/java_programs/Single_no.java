/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_programs;

/**
 *
 * @author Lenovo
 */
public class Single_no {
    public static void main(String args[]){
        System.out.println("Hello World");
		int[] nums = {4,1,2,1,2};
		int[] A = new int[nums.length];
		for(int i=0;i<nums.length;i++){
		    A[i]=0;
		}
		for(int i=0;i<nums.length;i++){
		    A[nums[i]]++;
		}
		for(int i=0;i<nums.length;i++){
		    System.out.print(A[i]+" ");
		}
		System.out.println();
		for(int i=0;i<nums.length;i++){
		    if(A[i]==1){
		        System.out.println(i);
		    }
		}
    }
}
