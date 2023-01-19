/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matrix;

/**
 *
 * @author Lenovo
 */
public class ReverseMatrix {
    static int[][] reverse(int[][] a ){
        
        for(int i=0;i<a.length;i++){
            int r1=0;
            int c1= a[0].length-1;
            while(r1<c1){
                int t = a[i][r1];
                a[i][r1] = a[i][c1];
                a[i][c1] =t;
                r1++;
                c1--;
            }
        }
        return a;
    }
    public static void main(String args[]){
        int[][] a = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int[][] t = reverse(a);
        for(int i=0;i<t.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
