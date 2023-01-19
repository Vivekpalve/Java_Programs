
package java_programs.array_programs;

import java.util.*;

/**
 *
 * @author Lenovo
 */
public class Frequency_of_element {
    static void countFequency1(int[] A,int n){
        boolean[] visit = new boolean[n];
        Arrays.fill(visit,false);
        
        for(int i=0;i<n;i++){
            
            if(visit[i]==true){
                continue;
            }
            int count=1;
            for(int j=i+1;j<n;j++){
                if(A[i]==A[j]){
                    visit[j]=true;
                    count++;
                }
            }
            System.out.println("count of "+A[i]+" is "+count);
            System.out.println(" the end ");
        }
    }
    static void countFequency2(int[] A,int n){
        Arrays.sort(A);
        
        for(int i=0;i<n;i++){
            int count=1;
            
            while(i<n-1 && A[i]==A[i+1]){
                i++;
                count++;
            }
            System.out.println("count of "+A[i]+" is "+count);
        }
        System.out.println(" the end ");
    }
    static void countFequency3(int[] A,int n){
        
        Map<Integer,Integer> s = new LinkedHashMap<>();
        
        for(int i=0;i<n;i++){
            if(s.containsKey(A[i])){
                s.put(A[i],s.get(A[i])+1);
            }else{
                s.put(A[i], 1);
            }
        }
        for(Map.Entry<Integer,Integer> e : s.entrySet()){
//           System.out.println(e.getKey()+" : "+e.getValue() );
             if(e.getValue()==1){
                 System.out.println(e.getKey());
                 break;
             }
        }
//        HashMap<Integer,Integer> s = new HashMap<>();
//        List<Integer> l = new ArrayList<>();
//        for(int i:nums){
//            s.put(i,s.getOrDefault(i,0)+1);
//        }
//        for(Map.Entry<Integer,Integer> e :s.entrySet()){
//            if(e.getValue()>1){
//                l.add(e.getKey);
//            }
//        }
//        return l;
    }
    public static void main(String args[]){
        
        int[] A = {-1,-17 ,-12, 8 ,16, -17 ,-13, -14, -3, -6, -5, -11, -10, -12, -5, 19, -17, -5, -1, 12};
        
        countFequency1(A,A.length);
        countFequency2(A,A.length);
        countFequency3(A,A.length);
    }
}
