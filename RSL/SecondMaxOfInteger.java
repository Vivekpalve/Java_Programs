/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RSL;

/**
 *
 * @author Lenovo
 */
public class SecondMaxOfInteger {
    static void check(int n){
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        while(n>0){
            if(n%10>max1){
                max2=max1;
                max1=n%10;
            }
            else if(n%10>max2){
                max2=n%10;
            }
            n=n/10;
        }
        System.out.println(max1+" "+max2);
    }
    public static void main(String args[]){
        check(143565);
        int a=5,b=8,c=34,d=43,e=54;
        int max1=0;
        int max2=0;
        
        
        if(a>b && a>c && a>d && a>e){
            max1=a;
        }
        else if(b>a && b>c && b>d && b>e){
            max1=b;
        }
        else if(c>b && c>a && c>d && c>e){
            max1=c;
        }
        else if(d>b && d>c && d>a && d>e){
            max1=d;
        }
        else{
            max1=e;
        }
        
        if(a<max1 && (a>b && a>c && a>d && a>e)){
            max2=a;
        }
        else if(b<max1 && (b>a && b>c && b>d && b>e)){
            max2=b;
        }
        else if(c<max1 && (c>b && c>a && c>d && c>e)){
            max2=c;
        }
        else if(d<max1 && (d>b && d>c && d>a)){
            max2=d;
        }
        else{
            max2=e;
        }
        System.out.println(max1+" "+max2);
    }
}
