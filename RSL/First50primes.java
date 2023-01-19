/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RSL;

/**
 *
 * @author Lenovo
 */
public class First50primes {
    static boolean isPrime(int p){
        for(int i=p-1;i>1;i--){
            if(p%i==0){
                return false;
            }
        }
        return true;
    }
    static void check(int n){
        int count=0;
        boolean i= true;
        int p=2;
        while(i){
            if(isPrime(p)){
                count++;
                System.out.println(p+" : "+count);    
            }
            p++;
            if(count==n){
                i=false;
            }
        }
        
    }
    public static void main(String args[]){
        
        check(100000);
    }
}
