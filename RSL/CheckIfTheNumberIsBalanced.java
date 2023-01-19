/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RSL;

/**
 *
 * @author Lenovo
 */
public class CheckIfTheNumberIsBalanced {
    static void check(String N){
        int mid=N.length()/2;
        int LHS=0;
//        System.out.println(mid);
        for(int i=0;i<mid;i++){
            LHS=LHS+Character.getNumericValue(N.charAt(i));
            System.out.print(LHS+" ");
        }
        int RHS=0;
        for(int i=mid+1;i<N.length();i++){
            RHS=RHS+Character.getNumericValue(N.charAt(i));
            System.out.print(RHS+" ");
        }
        if(LHS==RHS){
            System.out.println(LHS+" "+RHS);
        }
        System.out.println(LHS+" "+RHS);
    }
    public static void main(String args[]){
        
        String s ="1234006";
        
        check(s);
    }
}
