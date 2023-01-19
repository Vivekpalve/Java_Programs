/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_programs;

class Hello{
    protected int i;
    Hello(){
        i=10;
    }
    public void printI(){
        System.out.println(i);
    }
}
class Hi extends Hello{
    protected int j;
    Hi(){
        super();
//        super.i=20;
        
        j=30;
    }
    public void printIJ(){
        super.printI();
        System.out.println(j);
    }
}
public class Super {
    public static void main(String args[]){
        Hi h = new Hi();
        h.printIJ();
    }
}
