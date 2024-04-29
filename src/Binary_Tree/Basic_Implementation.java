package Binary_Tree;

import java.util.LinkedList;
import java.util.Queue;

public class Basic_Implementation {
    public static int size = 0;
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    public static void display(Node root){
        if (root==null)return;
        size++;
        System.out.print(root.data+"--> ");
        if (root.left != null)System.out.print(root.left.data+" , ");
        if (root.right != null)System.out.println(root.right.data+" , ");
        display(root.left);
        display(root.right);
    }
    public static int Size(Node root){////////  Size------------
        if (root==null)return 0;
        return 1+Size(root.right) + Size(root.left);
    }
    public static int Sum(Node root){////////    Sum------------
        if (root== null) return 0;
        return root.data + Sum(root.left)+ Sum(root.right);
    }
    public static int Max(Node root){
        if (root == null) return 0;
        int a = root.data;
        int b = Max(root.left);
        int c = Max(root.right);
        return Math.max(a,Math.max(b,c));
    }
    public static void preorder(Node root){
        if (root == null) return;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void Inorder(Node root){
        if (root == null)return;
        Inorder(root.left);
        System.out.print(root.data+" ");
        Inorder(root.right);
    }
    public static void Postorder(Node root){
        if (root ==null)return;
        Postorder(root.left);
        Postorder(root.right);
        System.out.print(root.data+" ");
    }
    public static void bfs(Node root){
        Queue<Node> que = new LinkedList<>();
        if (root!= null)que.add(root);
        while (que.size()>0){
            Node temp = que.peek();
            if (temp.left != null) que.add(temp.left);
            if (temp.right != null) que.add(temp.right);
            System.out.print(temp.data+" ");
            que.remove();
        }
    }
    public static int height(Node root){
        if (root == null) return 0;
        if (root.left == null && root.right == null)return 0;
        return 1+ Math.max(height(root.left),height(root.right));
    }
    public static int Diameter(Node root){
        if (root==null || root.left==null && root.right==null) return 0;
        int leftans = Diameter(root.left);
        int rightans = Diameter(root.right);
        int mid = height(root.left)+height(root.right);
        if (root.left != null)mid++;
        if (root.right != null)mid++;
        int max = Math.max(leftans,Math.max(rightans,mid));
        return max;
    }
    public static void main(String[] args) {
        Node root = new Node(5);
        Node a = new Node(6);
        Node b = new Node(7);
        Node c = new Node(8);
        Node d = new Node(9);
        Node e = new Node(10);
        Node f = new Node(11);
        root.left = a;
        root.right = b;
        a.left = c;
        a.right = d;
        b.left = e;
        b.right = f;
        display(root);
        System.out.println("Size = "+ size);
        System.out.println(Size(root));
        System.out.println(Sum(root));
        System.out.println();
        preorder(root);
        System.out.println();
        Inorder(root);
        System.out.println();
        Postorder(root);
        System.out.println();
        System.out.println("Max value = "+Max(root));
        System.out.println();
        bfs(root);
        System.out.println();
        System.out.println(Diameter(root));
    }
}
