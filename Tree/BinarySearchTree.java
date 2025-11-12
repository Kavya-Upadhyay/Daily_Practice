package Tree;

public class BinarySearchTree {

    class Node{
        int val;
        Node left;
        Node right;
    }
    private Node root;

    public void BianrySt(int[] arr){
        root = CreateTree(arr,0,arr.length-1);
    }

    private Node CreateTree(int[] arr,int start,int end){
        if(start > end){
            return null;
        }

        int mid = start + (end-start)/2;
        Node nn = new Node();
        nn.val = arr[mid];
        nn.left = CreateTree(arr,start,mid-1);
        nn.right = CreateTree(arr,mid+1,end);
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

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        int[] arr = {1,2,3,4,5,6,7,8,9};
        bst.BianrySt(arr);
        bst.Display();
    }

}
