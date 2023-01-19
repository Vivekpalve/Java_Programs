/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_programs;

/**
 *
 * @author Lenovo
 */
class Base{
    protected int i;
//    public Base(){
//        System.out.println("default base class constructor");
//        
//    }
    public Base(int i){
        System.out.println("paramerterized base class constructor");
        this.i=i;
    }
    public void printI(){
        System.out.println(i);
    }
}
class Derived extends Base{
    int j;
    public Derived(int i,int j){
        super(i);
        System.out.println("Derived class constructor");
        this.j=j;
    }
    public void printIJ(){
        System.out.println(i);
        System.out.println(j);
    }
}
public class Demo {
    public static void main(String args[]){
        Derived d = new Derived(20,10);
        d.printI();
        d.printIJ();
    }
}
