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
//public class firstlast {
//    int l=0;
//        int r=nums.length-1;
//        int fst=-1;
//        while(l<=r){
//            int mid=(l+r)/2;
//            if(nums[mid]==target){
//                fst=mid;
//                r=mid-1;
//            }else if(nums[mid]<target){
//                l=mid+1;
//            }else r=mid-1;
//        }
//        l=0;
//        r=nums.length-1;
//        int lst=-1;
//        while(l<=r){
//            int mid=(l+r)/2;
//            if(nums[mid]==target){
//                lst=mid;
//                l=mid+1;
//            }else if(nums[mid]<target){
//                l=mid+1;
//            }else r=mid-1;
//        }
//        return new int[]{fst,lst};
//}
