import java.util.*;

class TreeNode {
    TreeNode left, right;
    int data;

    TreeNode(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class PreorderTraversal 
{

    Scanner sc = new Scanner(System.in);

    //Create Tree

    public TreeNode createTree() 
    {
        System.out.println("Enter data: ");
        int data = sc.nextInt();

        if (data == -1) {
            return null;
        }

        TreeNode root = new TreeNode(data);

        System.out.println("Enter left data for " + data);
        root.left = createTree();

        System.out.println("Enter right data for " + data);
        root.right = createTree();

        return root;
    }

    // Preorder Tree Traversal

    List<Integer> preorderTraversal(TreeNode root) 
    {
        List<Integer> list = new LinkedList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();

        /*The given code snippet implements an iterative version of the preorder traversal algorithm using a stack to simulate the recursion.*/

        while (root != null) 
        {
            list.add(root.data);
            if (root.right != null) {
                stack.push(root.right);
            }
            root = root.left;
            if (root == null && !stack.isEmpty()) {
                root = stack.pop();
            }
        }

        return list;
    }

    //Print Tree

    public void printTree(TreeNode root) {
        System.out.println(preorderTraversal(root));
    }

    public static void main(String[] args) {
        PreorderTraversal tree = new PreorderTraversal(); // Corrected object creation
        TreeNode root = tree.createTree();

        System.out.println("Preorder traversal of the tree:");
        tree.printTree(root);
    }
}
