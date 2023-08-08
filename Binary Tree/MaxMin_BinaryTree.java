import java.util.*;

class Node{
    Node left, right;
    int data;

    Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
    
}
public class MaxMin_BinaryTree 
{
    Scanner sc = new Scanner(System.in);
     public Node createTree()
     {
        System.out.println("Enter data:");
        int data = sc.nextInt();

        if (data == -1)
        return null;

        Node root = new Node(data);

        System.out.println("Enter left node data for "+data);
        root.left = createTree();

        System.out.println("Enter right node data for "+data);
        root.right = createTree();
 
        return root;
     }
     public int min_Bt(Node root)
     {
        if(root == null)
        return Integer. MAX_VALUE;
        
        return Math.min(root.data, Math.min(min_Bt(root.left), min_Bt(root.right)));
        
     }
     public int max_Bt(Node root)
     {
        if(root == null)
        return Integer. MIN_VALUE;
        
        return Math.max(root.data, Math.max(max_Bt(root.left), max_Bt(root.right)));
        
     }

     public static void main (String args[])
     {
        MaxMin_BinaryTree obj = new MaxMin_BinaryTree ();
        Node root = obj.createTree();
        System.out.println("Minimum: "+obj.min_Bt(root));
        System.out.println("Maximum: "+obj.max_Bt(root));

     }

}
