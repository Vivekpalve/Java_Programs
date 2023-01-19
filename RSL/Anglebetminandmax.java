/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RSL;

/**
 *
 * @author Lenovo
 */
// Java program to find angle between hour and minute hands
import java.io.*;

class Anglebetminandmax{
    
    static int calcAngle(int h,int m){
        if(h<0 || m<0 || m>60){
            return -1;
        }
        if(h==12){
            h=0;
            if(m==60){
                m=0;
                h+=1;
                if(h>12){
                    h=h-12;
                }
            }
        }
        int hhand = (int)(0.5*(h*60+m));
        int mhand = (int)(6*m);
        int angle = Math.abs(hhand-mhand);
        angle = Math.min(360-angle, angle);
        return angle;
    }
    public static void main (String[] args){
	System.out.println(calcAngle(15, 55)+" degree");
	System.out.println(calcAngle(3, 30)+" degree");
    }
}



