/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package STACK;

/**
 *
 * @author Lenovo
 */
class Node{
    int data;
    Node link;
    Node(int d){
        data=d;
        link=null;
    }
}
public class CreatingLLFromArray {
    Node root;
    CreatingLLFromArray(){
        root=null;
    }
    private void create(int[] A){
        
    }
    public static void main(String args[]){
        int[] A = new int[]{10,20,30,40,50,60,70,80,90,100};
        CreatingLLFromArray l = new CreatingLLFromArray();
        l.create(A);
    }
}
