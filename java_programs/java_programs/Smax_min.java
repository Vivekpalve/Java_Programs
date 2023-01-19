/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_programs;
public class Smax_min {
    public static void main(String args[]){
        int A[][] ={{44,21,4},{6,2,42}};
        int max=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[i].length;j++){
                if(A[i][j]>max){
                    max2=max;
                    max=A[i][j];
                }
                else if(A[i][j]>max2){
                    max2=A[i][j];
                }
                
                if(A[i][j]<min){
                    min2=min;
                    min=A[i][j];
                }
                else if(A[i][j]<min2){
                    min2=A[i][j];
                }
            }
        }
        System.out.println(max+" "+max2);
        System.out.println(min+" "+min2);
    }
}
