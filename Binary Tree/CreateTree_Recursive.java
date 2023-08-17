
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

public class CreateTree
{    
        Scanner sc = new Scanner(System.in);
        public Node createTree() 
        {
            System.out.println("Enter data: ");
            int data = sc.nextInt();

            if (data == -1) {
                return null;
            }
            //Object creation of Node class 
            Node root = new Node(data);   

            System.out.println("Enter left data for " + data);
            root.left = createTree();

            System.out.println("Enter right data for " + data);
            root.right = createTree();

            return root;
        }
        public static void main(String[] args) 
    {    
        CreateTree tree = new CreateTree();
        System.out.println(tree.createTree());
    
    }
}
