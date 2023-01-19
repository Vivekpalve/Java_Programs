/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tree;

import java.util.*;


class Node{
    int data;
    Node left,right;
    
    Node(int data){
        this.data = data;
        left=null;
        right =null;
    }
}
public class BinaryTreeCreation {
    static Scanner sc = null;
    static Node createTree(){
        Node root = null;
        System.out.println("enter the data :");
        int data = sc.nextInt();
        if(data==-1){
            return null;
        }
        root = new Node(data);
        System.out.println("Enter left child value of "+data);
        root.left = createTree();
         System.out.println("Enter right child value of"+data);
        root.right = createTree();
        return root;
    }
    static void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    static void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    static void postOrder(Node root){
        if(root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }
    static int height(Node root){
        int l=0;
        int r =0;
        if(root==null){
            return 0;
        }
        l = height(root.left);
        r = height(root.right);
        if(l>r){
            return l+1;
        }
        else{
            return r+1;
        }
    }
    static void levelOrder(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node curr = q.poll();
            System.out.print(curr.data+" ");
            if(curr.left!=null){
                q.add(curr.left);
            }
            if(curr.right!=null){
                q.add(curr.right);
            }
        }
    }
    public static void main(String args[]){
        sc = new Scanner(System.in);
        Node root = createTree();
        preOrder(root);
        System.out.println();
        inOrder(root);
        System.out.println();
        postOrder(root);
        System.out.println();
        System.out.println("Height of tree is :"+height(root));
        levelOrder(root);
        
    }
}
