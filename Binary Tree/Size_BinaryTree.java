import java.util.*;
class Node 
{
    Node left, right;
    int data;

    Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
}

public class Size_BinaryTree 
{
    Scanner sc = new Scanner (System.in);
    public Node createTree()
    {
        System.out.println("Enter data:");
        int data = sc.nextInt();

        if(data == -1)
        return null;

        Node root = new Node(data);
        System.out.println("Enter left node data for "+data);
        root.left = createTree();

        System.out.println("Enter right node data for "+data);
        root.right = createTree();

        return root;
    }

    public int size_BT(Node root)
    {
        if(root == null)
        return 0;

        return size_BT(root.left) + size_BT(root.right) + 1;
    }

    public static void main(String args[])
    {
        
        Size_BinaryTree obj = new Size_BinaryTree();
        Node root = obj.createTree();
        System.out.println("Size of Binary Tree: "+obj.size_BT(root));

    }
}
