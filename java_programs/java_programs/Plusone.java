/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_programs;

/**
 *
 * @author Lenovo
 */
import java.util.*;
public class Plusone {
    public static void main(String args[]){
        
        int[] A = new int[]{9,9,9};
        int[] b = new int[]{1,1,1};
        List<Integer> l = new ArrayList<Integer>();
        int alen=A.length;
        int blen=b.length;
        int carry=0;
        

        for(int i=alen-1;i>=0;i--){
            int p =A[i]+b[i]+carry;
            l.add(p%10);
            carry=p/10;
        }
        l.add(carry);
        Collections.reverse(l);
        for(int i = 0; i < l.size(); i++) {   
              System.out.print(l.get(i));
        }
        System.out.println();
    }
}
