/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RSL;

/**
 *
 * @author Lenovo
 */

import java.util.*;
public class Array_Add_Two_D {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the no of rows :");
        int r=sc.nextInt();

        System.out.println("enter the no cols :");
        int c =sc.nextInt();

        int x[][] = new int[r][c];
        int y[][] = new int[r][c];

        int z[][] = new int[r][c];

        System.out.println("enter the array x :");
        for(int i=0;i<r;i++)
           for(int j=0;j<c;j++)
              x[i][j]=sc.nextInt();

              System.out.println("enter the array y :");
              for(int i=0;i<r;i++)
                 for(int j=0;j<c;j++)
                    y[i][j]=sc.nextInt();

        System.out.println("sum of array x and array y is :");
        for(int i=0;i<r;i++)
        {

            for(int j=0;j<c;j++)
            {
                z[i][j]=x[i][j] + y[i][j];
                System.out.print(z[i][j]+" ");
            }
            System.out.println();
        }
        
        System.out.println("sub of array x and array y is :");
        for(int i=0;i<r;i++)
        {

            for(int j=0;j<c;j++)
            {
                z[i][j]=x[i][j] - y[i][j];
                System.out.print(z[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("multi of array x and array y is :");
        for(int i=0;i<3;i++){    
           for(int j=0;j<3;j++){    
              z[i][j]=0;      
              for(int k=0;k<3;k++)      {      
                 z[i][j]+=x[i][k]*y[k][j];      
               }//end of k loop  
               System.out.print(z[i][j]+" ");
            }
            System.out.println();
        }  
        sc.close();
    }
}
