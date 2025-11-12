package Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Create_Tree_Level_order {
    class Node{
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val = val;
        }

    }

    private Node root;

    public void CreateTree(){
        Create_Tree_fromorder();
    }
    private void Create_Tree_fromorder(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node nn = new Node(n);
        root = nn;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node rv = q.poll();
            int c1 = sc.nextInt();
            int c2 = sc.nextInt();
            if(c1!=-1){
                Node newnode = new Node(c1);
                rv.left = newnode;
                q.add(newnode);
            }
            if(c2!=-1){
                Node newnode = new Node(c1);
                rv.right = newnode;
                q.add(newnode);
            }

        }
    }

    public void display(){
        display(root);
    }
    private void display(Node nn){
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
        display(nn.left);
        display(nn.right);
    }

    public static void main(String[] args) {
        Create_Tree_Level_order obj = new Create_Tree_Level_order();
        obj.CreateTree();
        obj.display();
    }
}
