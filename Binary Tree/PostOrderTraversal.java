import java.util.*;

class TreeNode 
{
    int data;
    TreeNode left, right;

    TreeNode(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
}

public class PostOrderTraversal 
{
    Scanner sc = new Scanner (System.in);
    
    public TreeNode createTree()
    {
        System.out.println("Enter Data: ");
        int data = sc.nextInt();
        if (data == -1)
        {
            return null;
        }
        TreeNode root = new TreeNode(data);

        System.out.println("Enter left data for " + data);
        root.left = createTree();

        System.out.println("Enter right data for " + data);
        root.right = createTree();

        return root;
    }

    public List<Integer> postOrderTraversal(TreeNode root) 
    {
        LinkedList<Integer> result = new LinkedList<>();
        Deque<TreeNode> stack = new ArrayDeque<>();
        TreeNode p = root;
        
        while (!stack.isEmpty() || p != null) 
        {
            if (p != null) 
            {
                stack.push(p);
                result.addFirst(p.data);  // Reverse the process of preorder
                p = p.right;             // Reverse the process of preorder
            } 
            else 
            {
                TreeNode node = stack.pop();
                p = node.left;           // Reverse the process of preorder
            }
        }
        
        return result;
    }

    public void printTree(TreeNode root)
    {
        System.out.println(postOrderTraversal(root));
    }

    public static void main(String args[])
    {
        PostOrderTraversal tree = new PostOrderTraversal();
        TreeNode root = tree.createTree();
        tree.printTree(root);
    }
}
