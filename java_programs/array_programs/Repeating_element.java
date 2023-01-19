
package java_programs.array_programs;

/**
 *
 * @author Lenovo
 */
import java.util.*;
public class Repeating_element {
    
    static void repeatingElement(int[] A,int n){
        Map<Integer,Integer> s = new HashMap<>();
        
        for(int i=0;i<n;i++){
            if(s.containsKey(A[i])){
                s.put(A[i], s.get(A[i])+1);
            }
            else{
                s.put(A[i],1);
            }
        }
        System.out.println("count having 2 or more than 2");
        for(Map.Entry<Integer,Integer> e : s.entrySet()){
            if(e.getValue()>=2){
                System.out.println(e.getKey());
            }
        }
        System.out.println("count having only 1");
        for(Map.Entry<Integer,Integer> e : s.entrySet()){
            if(e.getValue()<=1){
                System.out.println(e.getKey());
            }
        }
    }
    public static void main(String args[]){
        int[] A = {10, 30, 30, 20, 10, 20, 50, 10,60,70};
        
        repeatingElement(A,A.length);
    }
}
