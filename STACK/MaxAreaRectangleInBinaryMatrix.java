package STACK;
import java.util.*;
public class MaxAreaRectangleInBinaryMatrix { 
    public static int maxArea(int M[][], int n, int m) {
        int[] arr = new int[m];
        for(int j=0;j<m;j++){
            arr[j] = M[0][j];   
        }
        int max  = getMaxArea(arr , m);
        for(int i=1;i<n;i++){
           for(int j=0;j<m;j++){
              if(M[i][j] == 0){
                 arr[j] = 0;
                }
                else{
                arr[j] = arr[j] + M[i][j];
                }
            }
            max =  Math.max(max,getMaxArea(arr,m));
        }
        return max;
    }
      public static int getMaxArea(int hist[], int n) {
          int[] left = leftmin(hist, n);
          int[] right = rightmin(hist, n);
   
          int[] area = new int[n];
          for(int i = 0; i<n; i++) {
             area[i] = ( right[i] - left[i] -1)* hist[i];
          }
          int max = area[0]; 
          for(int i = 1; i<n; i++) {
             if(area[i] > max) {
               max = area[i];
            }
         } 
      
         return max;
    }
    public static int[] leftmin(int[] hist, int n) {
      int[] index = new int[n];
      Stack<Integer> s = new Stack<>();
      for(int i = 0; i<n; i++) {
          if(s.isEmpty()) {
              index[i] = -1;
          }
          else if(!s.isEmpty() && hist[s.peek()] >= hist[i]) {
              while(!s.isEmpty() && hist[s.peek()] >= hist[i]) {
                  s.pop();
              }
              if(s.isEmpty()) {
                  index[i] = -1;
              }
              else{
                  index[i] = s.peek();
              }
          }
          else{
              index[i] = s.peek();
          }
          s.push(i);
      }
      return index;
    }
    public static int[] rightmin(int[] hist, int n) {
      int[] index = new int[n];
      Stack<Integer> s = new Stack<>();
      for(int i = n-1; i>=0; i--) {
          if(s.isEmpty()) {
              index[i] = n;
          }
          else if(!s.isEmpty() && hist[s.peek()] >= hist[i]) {
              while(!s.isEmpty() && hist[s.peek()] >= hist[i]) {
                  s.pop();
              }
              if(s.isEmpty()) {
                  index[i] = n;
              }
              else{
                  index[i] = s.peek();
              }
          }
          else{
              index[i] = s.peek();
          }
          s.push(i);
      }
      return index;
    }
    public static void main(String args[]){
        int[][] AA= new int[][]{
                                 {0,1,1,0},
                                 {1,1,1,1},
                                 {1,1,1,1},
                                 {1,1,0,0}
                                };
        int max = maxArea(AA,4,4);
        System.out.println(max);
    }
}