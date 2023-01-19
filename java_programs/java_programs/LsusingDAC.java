/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_programs;

/**
 *
 * @author Lenovo
 */
public class LsusingDAC {
    static int lSearch(int[] A,int s,int e,int key){
        if(s==e){
            return -1; 
        }
        int mid=(s+e)/2;
        if(A[mid]==key){
            return mid+1;
        }
        int p=lSearch(A,s,mid,key);
        if(p==-1){
            p=lSearch(A,mid+1,e,key);
            if(p==-1){
                return -1;
            }
            else{
                return p;
            }       
        }
        return p;
    }
    public static void main(String args[]){
        int[] A ={8,3,6,4,12,7,5,1,9,11,2};
        
        int q=lSearch(A,0,A.length,2);
        if(q==-1){
            System.out.println("not fount");
        }
        else{
            System.out.println("found At :"+q);
        }
    }
}
