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
public class Traversal 
{
    Scanner sc = new Scanner (System.in);
    
    public Node createTree()
    {
    System.out.println("Enter Data: ");
    int data = sc.nextInt();

    if(data == -1) 
    return null;

    Node root = new Node(data);

    System.out.println("Enter left data for "+data);
    root.left = createTree();

    System.out.println("Enter right data for "+data);
    root.right = createTree();

    return root; 
    }

    public void inOrderTraversal (Node root)
    {
        if(root == null) return;

       inOrderTraversal(root.left);
       System.out.println(root.data);
       inOrderTraversal(root.right);

    }

    public void preOrderTraversal (Node root)
    {
        if(root == null) return;

       System.out.println(root.data);
       preOrderTraversal(root.left);
       preOrderTraversal(root.right);

    }

    public void postOrderTraversal (Node root)
    {
        if(root == null) return;

       postOrderTraversal(root.left);
       postOrderTraversal(root.right);
       System.out.println(root.data);

    }

    public static void main(String args[])
    {
        
        Traversal obj = new Traversal ();
        Node root = obj.createTree();
        System.out.println();
        obj.inOrderTraversal(root);
        System.out.println();
        obj.preOrderTraversal(root);
        System.out.println();
        obj.postOrderTraversal(root);
    }
}
