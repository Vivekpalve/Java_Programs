///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package RSL;
//
//import java.util.Scanner;
//import java.math.*;
///**
// *
// * @author Lenovo
// */
//public class RecursiveDigitSumProblem {
////    static int sum=0;
//    static int check(int n){
//        
//        if(n==0){
//            return 0;
//        }
//        return (n%10+check(n/10));
//        
//    }
//    public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        
//        int k =sc.nextInt();
//        String str="";
//        for(int i =0;i<k;i++){
//            str=str+s;
//        }
//        Long n = Long.valueOf(str);
//      
//        System.out.println(n);
//        Long p =check(n);
//        while(p>10){
//            p=check(p);
//        }
//        System.out.println(p);
//    }
//}
