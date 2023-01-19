/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RSL;

/**
 *
 * @author Lenovo
 */
public class BooleanMatrix {
    static int check(int[][] A){
        int count =0;
        
        for(int i=0;i<A.length;i++){
            boolean  flag = false;
            for(int j=0;j<A[0].length;j++){
                if(A[i][j]==1){
                    flag=true;
                    break;
                }
            }
            if(flag){
                for(int k=0;k<A[0].length;k++){
                    A[i][k]=1;
               }
            }
        }
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[0].length;j++){
                if(A[i][j]==1){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String args[]){
        
        int[][] A= new int[][]{{1,0,0,0},
                               {0,0,0,0},
                               {0,0,1,0},
                               {0,0,0,0},
                               {0,0,0,1}
                              };
        
        int n=check(A);
        System.out.println(n);
    }
}
