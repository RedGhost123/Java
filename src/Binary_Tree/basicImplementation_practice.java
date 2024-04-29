package Binary_Tree;

import java.util.*;

public class basicImplementation_practice {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    public static void preorder(Node root){
        if (root == null)return;
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
    public static void postorder(Node root){
        if (root == null)return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    public static int Size(Node root){
        if (root== null)return 0;
        return 1+(Size(root.left) + Size(root.right));
    }
    public static int sum(Node root){
        if (root == null)return 0;
        return root.data + sum(root.left) + sum(root.right);
    }
    public static int Maximum(Node root){
        if (root == null) return 0;
        int a = root.data;
        int b = Maximum(root.left);
        int c = Maximum(root.right);
        return Math.max(a,Math.max(b,c));
    }
    public static int Level(Node root){
        if (root == null)return 0;
        return 1 + Math.max(Level(root.left),Level(root.right));
    }
    public static int height(Node root){
        if (root == null) return 0;
        if (root.right == null || root.left == null) return 0;
        return 1 + Math.max(height(root.left),height(root.right));
    }
    public static void Nthlevel(Node root,int n){
        if (root == null) return;
        if (n==1) {
            System.out.print(root.data);
            return;
        }
        Nthlevel(root.left,n-1);
        Nthlevel(root.right,n-1);
    }
    public static void BFS(Node root){
        Queue<Node> que = new LinkedList<>();
        if ( root != null) que.add(root);
        while (que.size()>0){
            Node temp = que.peek();
            if (temp.left != null) que.add(temp.left);
            if (temp.right != null) que.add(temp.right);
            System.out.print(temp.data+" ");
            que.remove();
        }
    }
    public static List<Integer> DFSInorder(Node root){
        List<Integer> arr = new ArrayList<>();
        if (root == null) return arr;
        Stack<Node> st = new Stack<>();
        st.push(root);
        while (st.size()>0){
            Node temp = st.peek();
            if (temp.left != null){
                st.push(temp.left);
                temp.left = null;
            }else{
                st.pop();
                arr.add(temp.data);
                if (temp.right != null)st.push(temp.right);
            }
        }
        return arr;
    }
    public static int Diameter(Node root){
        if (root == null || root.right == null && root.left==null)return 0;
        int leftans = Diameter(root.left);
        int rightans = Diameter(root.right);
        int mid = height(root.left)+height(root.right);
        if (root.left!=null)mid++;
        if (root.right!=null)mid++;
        int max = Math.max(leftans,Math.max(mid,rightans));
        return max;
    }
    public static void helper(Node root,List<String> ans, String s){
        if (root == null)return;
        if (root.left == null || root.right==null){
            s += root.data;
            ans.add(s);
            return;
        }
        helper(root.left,ans,s+root.data+"->");
        helper(root.right,ans,s+root.data+"->");
    }
    public static List<String> Treepath(Node root){
        List<String> ans = new ArrayList<>();
        helper(root,ans,"");
        return ans;
    }
    public static void main(String[] args) {
        Node root = new Node(5);
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(1);
        Node d = new Node(4);
        Node e = new Node(7);
        Node f = new Node(8);
        root.left = a;
        root.right = b;
        a.left = c;
        a.right = d;
        b.left = e;
        b.right = f;
        preorder(root);
        System.out.println();
        Inorder(root);
        System.out.println();
        postorder(root);
        System.out.println();
        System.out.println("Size = "+Size(root));
        System.out.println();
        System.out.println("Sum = "+sum(root));
        System.out.println();
        System.out.println("Height = "+Maximum(root));
        System.out.println();
        System.out.println("height = "+height(root));
        System.out.println();
        System.out.println("LEvel = "+Level(root));
        System.out.println();
        Nthlevel(root,3);
        System.out.println();
        BFS(root);
        System.out.println();
        System.out.println(Diameter(root));
        System.out.println();
        System.out.println(Treepath(root));
    }
}
