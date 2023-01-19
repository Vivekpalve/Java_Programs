/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RSL;

/**
 *
 * @author Lenovo
 */
public class Replaceby_abc {
    static void check(String s){
        String[] p = s.split("\\.");
        for(int i=0;i<p.length;i++){
            if(i%2==1){
                p[i]="abc";
            }
        }
        String sp ="";
        for(int i=0;i<p.length-1;i++){
            sp+=p[i];
            sp+=".";
        }
        sp+=p[p.length-1];
        System.out.println(sp);
    }
    public static void main(String args[]){
        
        String s = "i.like.this.program.very.much";
        
        check(s);
    }
}