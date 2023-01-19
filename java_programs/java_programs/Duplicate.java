package java_programs;

/**
 *
 * @author Lenovo
 */
import java.util.*;
public class Duplicate {
    
    static int dup(int[] nums){
        
        Set<Integer> set = new HashSet<>();
        for (int v : nums) {
        set.add(v);
        
        }
        Iterator<Integer> i=set.iterator();  
           while(i.hasNext())  
           {  
           System.out.println(i.next());  
           }  
        int p=set.size();
        return p;
    }
 
    public static void main(String args[]){
        int[] A={1,1,2};
        
        int p=Duplicate.dup(A);
        System.out.println("this is main output");
        System.out.println(p);
    }
}
