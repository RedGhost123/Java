package Genric_Tree;
import java.util.*;

import static java.util.Collections.reverse;

public class Basic_Implementation {

    private static class Node{
        int data;
        List<Node> child;
        Node(int data){
            this.data = data;
            child  = new ArrayList<>();
        }
    }
    public static void Post_traversal(Node root) {
        if (root == null)return;
        if (root.child == null) {
            System.out.print(root.data + " ");
            return;
        }
        int n = root.child.size();
        for (int i = 0; i < n; i++) {
            Post_traversal(root.child.get(i));
        }
        System.out.print(root.data + " ");
    }
    public static void Pre_Traversal(Node root){
        if (root == null)return;
        if (root.child.isEmpty()){
            System.out.print(root.data+" ");
            return;
        }
        System.out.print(root.data+" ");
        int n = root.child.size();
        for (int i = 0;i< n;i++){
            Pre_Traversal(root.child.get(i));
        }
    }
    public static void BFS_Leveltraversal(Node root){
        Queue<Node> que = new LinkedList<>();
        que.add(root);
        while (!que.isEmpty()){
          Node currentnode = que.peek();
            System.out.print(currentnode.data+" ");
            que.remove();
            int numberofchild = currentnode.child.size();
            for (int i = 0; i<numberofchild;i++){
                que.add(currentnode.child.get(i));
            }
        }
    }
    public static void MirrorTree(Node root){
        if (root.child.isEmpty())return;
        if (root.child.size() == 1)return;
        for (int i = 0; i< root.child.size();i++){
            MirrorTree(root.child.get(i));
            reverse(root.child);
        }
    }

    public static void main(String[] args){
        Node root = new Node(30);
        root.child.add(new Node(5));
        root.child.add(new Node(11));
        root.child.add(new Node(63));
        root.child.get(0).child.add(new Node(1));
        root.child.get(0).child.add(new Node(4));
        root.child.get(0).child.add(new Node(8));
        root.child.get(1).child.add(new Node(6));
        root.child.get(1).child.add(new Node(7));
        root.child.get(1).child.add(new Node(15));
        root.child.get(2).child.add(new Node(31));
        root.child.get(2).child.add(new Node(55));
        root.child.get(2).child.add(new Node(65));

        Post_traversal(root);
        System.out.println();
        Pre_Traversal(root);
        System.out.println();
        BFS_Leveltraversal(root);
        System.out.println();
        MirrorTree(root);
        BFS_Leveltraversal(root);

    }
}
