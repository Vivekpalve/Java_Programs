/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_programs;

/**
 *
 * @author Lenovo
 */
public class Min_max {

    static void diff(int A[]){
        int min1=A[0],min2=A[0];
        int max1=A[0],max2=A[0];
        int p=0,q=0;
        for(int i=1;i<A.length;i++){
            if(A[i]%2==0){
                if(max1<A[i]){
                    max1=A[i];
                }
                if(min1>A[i]){
                    min1=A[i];
                }
            }
            else{
                if(max2<A[i]){
                    max2=A[i];
                }
                if(min2>A[i]){
                    min2=A[i];
                }
            }
            
        }
        // System.out.println(max1+" "+min1);
        p=max1-min1;
        q=max2-min2;
        System.out.println(p+" "+q);
    }
    
	public static void main(String[] args) {
		System.out.println("Hello World");
		int A[]={3 ,5 ,7 ,2 ,9 , 10 ,11};
		diff(A);
		
	}
}


