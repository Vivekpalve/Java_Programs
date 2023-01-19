/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RSL;

/**
 *
 * @author Lenovo
 */
public class Equilbrium {
    static Boolean check(int[] A){
        int sum=0;
        for(int i=0;i<A.length;i++){
            sum+=A[i];
        }
        int p=0;
        for(int i=0;i<A.length;i++){
            if(p==(sum-p-A[i])){
               return true;
            }
            else{
                p+=A[i];
            }
        }
        
        return false;
        
    }
    public static void main(String args[]){
        int[] A = new int[]{3,7,5,2,8};
        
        System.out.println(check(A));
    }
}

