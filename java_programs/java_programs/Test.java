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
//import java.util.*;
//public class Test {
//    public static void main(String args[]){
//        String x = "Adresses";
//        String ans="";
//        for(int i=0;i<x.length();i++){
//            int count=0;
//            for(int j=i;j<x.length();j++){
//                if(x.charAt(i)==x.charAt(j)){
//                    count++;
//                    break;
//                }
//            }
//            ans+=x.charAt(i) + Integer.toString(count);
//        }
//        System.out.println(ans);
//        
//        for(int i=1;i<=3;i++){
//            for(int j=1;j<=3*i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//            
//            
//        }
//        int[] A = new int[]{0,0,1,1,1,2,2,3,3,4};
//        int i=0;
//        for(int j=1;j<A.length;j++){
//            if(A[j]!=A[i]){
//                i++;
//                A[i]=A[j];
//            }
//        }
//        int xx=-1;
//        System.out.println(i+1);
//        int[] A1 = new int[]{2,2,1,1,1,2,2,1,2,1};
//        int f=A1.length/2;
//        for(int p:A1){
//            int count=0;
//            for(int s : A1){
//                if(s==p){
//                    count+=1;
//                }
//            }
//            if(count>f){
//                xx=p;
//            }
//        }
//        System.out.println(xx);
//                String st = "Sakkett";
//		int count=0;
//		char[] ch = new st.toCharArray();
//		for(int sp=0;sp<st.length();i++){
//		    for(int j=0;j<st.length();j++){
//		        if(ch[sp]==ch[j]){
//		            System.out.println(ch[j]);
//		            count++;
//		            break;
//		        }
//		    }
//		}
//    }
//}
