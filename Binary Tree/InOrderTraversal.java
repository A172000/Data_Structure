import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Stack;

class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
}

class InOrderTraversal 
{
    Scanner sc = new Scanner (System.in);

    public TreeNode createTree()
    {
    System.out.println("Enter data");
    int data = sc.nextInt();

    if(data == -1)
    return null;

    TreeNode root = new TreeNode(data);

    System.out.println("Enter left data for " + data);
        root.left = createTree();

        System.out.println("Enter right data for " + data);
        root.right = createTree();

        return root;
    }
   public List<Integer> inOrderTraversal(TreeNode root) 
   {
    List<Integer> list = new ArrayList<Integer>();
    Stack<TreeNode> stack = new Stack<TreeNode>();
    
    TreeNode currNode = root;

    while(currNode!=null || !stack.empty())
    {
        while(currNode!=null)
        {
            stack.push(currNode);
            currNode = currNode.left;
        }
        currNode = stack.pop();
        list.add(currNode.data);
        currNode = currNode.right;
    }

    return list;
}
public void printTree(TreeNode root) {
    System.out.println(inOrderTraversal(root));
}
public static void main(String args[])
{
    InOrderTraversal tree = new InOrderTraversal();
    TreeNode root = tree.createTree();
    tree.printTree(root);
}
}