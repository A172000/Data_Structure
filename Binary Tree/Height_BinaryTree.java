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

public class Height_BinaryTree 
{
    Scanner sc = new Scanner(System.in);
    public Node createTree()
    {
        System.out.println("Enter data");
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
    
    public int heightBT(Node root)
    {
      if(root == null) 
      return 0;

      return (Math.max(heightBT(root.left), heightBT(root.right))+1);
    }

    public static void main (String args[])
    {
        Height_BinaryTree obj = new Height_BinaryTree();
        Node root = obj.createTree();
        System.out.println("Height of Binary Tree: "+obj.heightBT(root));
    }
}
