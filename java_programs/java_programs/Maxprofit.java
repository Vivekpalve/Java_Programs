/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_programs;

/**
 *
 * @author Lenovo
 */
public class Maxprofit {
    static int max(double[] d,int i,int j){
        int p =0;
        double max1= Integer.MIN_VALUE;
        for(int q=i;q<j;q++){
            if(d[q]>max1){
                max1=d[q];
                p=q;
            }
        }
        return p;
    }
    static int min(double[] d){
        double min1= Integer.MAX_VALUE;
        int p=0;
        for(int i=0;i<d.length;i++){
            if(d[i]<min1){
                min1=d[i];
                p=i;
            }
        }
        return p;
    }
    public static void main(String args[]){
        double[]  d = new double[]{73.5,72.5,78,70,71,74,75.5,76,73,72};
        
        int d1 = min(d);
        int d2 =max(d,d1+1,d.length);
        System.out.println((d1+1)+" "+(d2+1));
        
    }
}
