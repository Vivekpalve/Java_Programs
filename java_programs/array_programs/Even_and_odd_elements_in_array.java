/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_programs.array_programs;

/**
 *
 * @author Lenovo
 */
public class Even_and_odd_elements_in_array {
    static void evenAndOdd(int[] A){
        int counteven1 = 0, countodd1 = 0;
        int counteven2 = 0, countodd2 = 0;
        for(int i=0;i<A.length;i++){
            if(A[i]%2==0){
                counteven1++;
            }else{
                countodd1++;
            }
        }
        System.out.println(counteven1+" "+countodd1);
        System.out.println("using bitwise operator");
        
        for(int i=0;i<A.length;i++){
            if((A[i]&1)==0){
                counteven2++;
            }else{
                countodd2++;
            }
        }
        System.out.println(counteven2+" "+countodd2);
    }
    public static void main(String args[]){
        int arr[] = {1, 20, 60, 31, 75, 40, 80};
        evenAndOdd(arr);
    }
}
