
package Tree;
class Node{
    int val;
    Node left;
    Node right;
    Node(int key){
        val = key;
        left=null;
        right=null;
    }
}
class BST{
    Node root;
    BST(){
        root=null;
    }
    void insert(int key){
        root=insertRec(root,key);
    } 
    private Node insertRec(Node root,int key){
        if(root==null){
            root= new Node(key);
            return root;
        }
        if(root.val>key){
            root.left = insertRec(root.left,key);
        }
        else if(root.val < key){
            root.right = insertRec(root.right,key);
        }
        return root;
    }
    public void inOrder(){
        inOrderRec(root);
    }
    public void preOrder(){
        preOrderRec(root);
    }
    public void postOrder(){
        postOrderRec(root);
    }
    void inOrderRec(Node root){
        if(root==null){
            return ;
        }
        inOrderRec(root.left);
        System.out.println(root.val);
        inOrderRec(root.right);
    }
    void preOrderRec(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.val+" ");
        preOrderRec(root.left);
        preOrderRec(root.right);
    }
    void postOrderRec(Node root){
        if(root==null){
            return;
        }
        postOrderRec(root.left);
        postOrderRec(root.right);
        System.out.print(root.val+" ");
    }
    void search(int key){
        if(searchRec(root,key)){
            System.out.println("element is found.");
        }
        else{
            System.out.println("Element is not found");
        }
        
    }
    boolean searchRec(Node root,int key){
        if(root==null){
            return false;
        }
        if(root.val==key){
            return true;
        }
        return searchRec(root.left,key) || searchRec(root.right,key);
    }
    
    void height(){
        System.out.println("height of tree is :"+heightRec(root));
    }
    
    int heightRec(Node node){
        int l= 0;
        int r =0;
        
        if(node ==null){
            return 0;
        }
        l = heightRec(node.left);
        r = heightRec(node.right);
        
        if(l>r){
            return l+1;
        }
        else{
            return r+1;
        }
    }
    boolean  p  =true;
    int isbal(Node root){
        
        if(root==null){
            return 0;
        }
        int l = isbal(root.left);
        int r = isbal(root.right);
        
        int gap = Math.abs(l-r);
        if(gap>1){
            p = false;
        }
        int t = Math.max(l,r)+1;
        return t;
    }
    void isBalanced()
    {
        // Your code here
    	isbal(root);
    	System.out.print("Is Tree Balance :"+ true);
    }
}
public class BSTCREATION {
   public static void main(String args[]){
        BST b = new BST();
        b.insert(8);
        b.insert(5);
        b.insert(2);
        b.insert(78);
        b.insert(12);
        b.insert(10);
        b.inOrder();
        b.search(5);
        
        b.height();
        b.isBalanced();
        
   }
}
