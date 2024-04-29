package BinarySearch_Tree;

public class Binary_Search_Tree {
    public static class Node{
        int data;
        Node left;
        Node rightl;
        Node(int data){
            this.data = data;
        }
    }
    public static boolean BST(Node root, int target){
        if (root == null) return false;
        if (root.data == target) return true;
        else if (root.data > target) {
           return BST(root.left,target);
        }else {
            return BST(root.rightl,target);
        }
    }
    public static Node insertBST(Node root, int val){
        if (root==null)return new Node(val);
        if (root.data>val){
            if (root.left == null){
                root.left = new Node(val);
            }else {
                insertBST(root.left,val);
            }
        }else {
            if (root.rightl==null){
                root.rightl = new Node(val);
            }else {
                insertBST(root.rightl,val);
            }
        }
        return root;
    }
    public static void Preorder_travel(Node root){
        if (root == null) return ;
        System.out.print(root.data+" ");
        Preorder_travel(root.left);
        Preorder_travel(root.rightl);
        }
    public static void Inorder_travel(Node root){
        if (root==null)return;
        Inorder_travel(root.left);
        System.out.print(root.data+" ");
        Inorder_travel(root.rightl);
    }
    public static void Delet(Node root, int target){
        if (root == null)return;
        if (root.data > target){
             if (root.left.data == target){
                 root.left = root.left.left;
                 root.left = null;
             }else {
                 Delet(root.left,target);
             }
         }else {
             if (root.rightl.data == target){
                 root.rightl = root.rightl.rightl;
                 root.rightl = null;
             }else {
                 Delet(root.rightl,target);
             }
         }
    }

    public static void main(String[] args){
        Node root = new Node(10);
        Node a = new Node(5);
        Node b = new Node(20);
        Node c = new Node(3);
        Node d = new Node(6);
        Node e = new Node(11);
        Node f = new Node(21);
        root.left = a;
        root.rightl = b;
        a.left = c;
        a.rightl = d;
        b.left = e;
        b.rightl = f;
        System.out.println(BST(root,111));
        System.out.println();
        insertBST(root,34);
        Preorder_travel(root);
        System.out.println();
        Inorder_travel(root);
        Delet(root,20);
        System.out.println();
        Inorder_travel(root);
    }
}
