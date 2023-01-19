///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package java_programs;
//
///**
// *
// * @author Lenovo
// */
//public class lastfirst {
//    int l=0;
//        int h=nums.length;
//        int first=-1;
//        while(l<=h){
//            int mid=l+(h-l)/2;
//            if(nums[mid]==target){
//                first=mid;
//                h=mid-1;
//            }
//            else if(target>nums[mid]){
//                l=mid+1;
//            }
//            else{
//                h=mid-1;
//            }
//        }
//        l=0;
//        h=nums.length;
//        int last=-1;
//        while(l<=h){
//            int mid=l+(h-l)/2;
//            if(nums[mid]==target){
//                last=mid;
//                l=mid+1;
//            }
//            else if(target<nums[mid]){
//                h=mid-1;
//            }
//            else{
//                l=mid+1;
//            }
//        }
//        int A[]=new int[2];
//        A[0]=first;
//        A[1]=last;
//        return A;
//}
