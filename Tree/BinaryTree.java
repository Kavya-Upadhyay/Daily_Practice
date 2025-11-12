package Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTree {
    class Node {
        int val;
        Node left;
        Node right;
    }

    private Node root;
    Scanner sc = new Scanner(System.in);

    public BinaryTree() {
        // TODO Auto-generated constructor stub
        root = CreateTree();
    }

    private Node CreateTree() {
        // TODO Auto-generated method stub
        int item = sc.nextInt();
        Node nn = new Node();
        nn.val = item;
        boolean hlc = sc.nextBoolean();// has left chlid
        if (hlc) {
            nn.left = CreateTree();
        }
        boolean hrc = sc.nextBoolean();// has right chlid
        if (hrc) {
            nn.right = CreateTree();
        }
        return nn;

    }
    public void Display(){
        Display(root);
    }
    private void Display(Node nn) {
        if (nn == null) {
            return;
        }
        String str = "<--" + nn.val + "-->";
        if (nn.left != null) {
            str = nn.left.val + str;
        } else {
            str = "." + str;
        }
        if (nn.right != null) {
            str = str + nn.right.val;
        } else {
            str = str + ".";
        }
        System.out.println(str);
        Display(nn.left);
        Display(nn.right);
    }

    private void PreOrder(Node nn) {
        // TODO Auto-generated method stub
        if (nn == null) {
            return;
        }
        System.out.print(nn.val + " ");
        PreOrder(nn.left);
        PreOrder(nn.right);

    }

    public void PreOrder() {
        PreOrder(root);
    }

    public void PostOrder() {
        PostOrder(root);
        System.out.println();
    }

    private void PostOrder(Node nn) {
        // TODO Auto-generated method stub
        if (nn == null) {
            return;
        }

        PostOrder(nn.left);
        PostOrder(nn.right);
        System.out.print(nn.val + " ");

    }

    public void LevelOrder() {
        Queue<Node> q = new LinkedList<>();
        q.add(root);// addlast
        while (!q.isEmpty()) {
            Node n = q.poll();// q.remove()--> removefirst

            if(n.left!=null) {
                q.add(n.left);
            }
            if(n.right!=null) {
                q.add(n.right);
            }
            System.out.print(n.val+" ");

        }
        System.out.println();
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // 10 true 20 true 40 false false true 50 false false true 30 false true 60 true 70 false false false
        BinaryTree bt = new  BinaryTree();
        bt.PreOrder();
        bt.LevelOrder();
        bt.Display();

    }

}