/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_programs;

/**
 *
 * @author Lenovo
 */
public class Buyandsell {
    public static int sell(int[] A){
        int min =A[0];
        int max=0;
        
        for(int i=0;i<A.length;i++){
            if(min>A[i]){
                min=A[i];
            }
            int p=A[i]-min;
            if(p>max){
                max=p;
            }
        }
        
        return max;
    }
    public static void main(String args[]){
        int [] A ={1, 4, 5, 2, 4};
        int c=sell(A);
        System.out.println(c);
        String s = ":97vqlcm5w";
        s=c+s;
        System.out.println(s);
    }
}

