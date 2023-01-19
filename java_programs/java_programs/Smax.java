/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_programs;
public class Smax {
    static void check(int[] n){
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        
        for(int i=0;i<n.length;i++){
            if(n[i]>max1){
                max2=max1;
                max1=n[i];
            }
            else if(n[i]>max2 && n[i]!=max1){
                max2=n[i];
            }
        }
        System.out.println(max2);
    }
    public static void main(String args[]){
       int[] n={15,4,11,15,14};
       
       check(n);
    }
}
