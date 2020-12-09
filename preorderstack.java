import java.util.*;
public class preorderstack {
    Node root;
    public void preorder(Node root)
    {
        Stack<Node> s=new Stack<Node>();
        s.push(root);
        while(s.isEmpty()==false)
        {
            Node temp=s.pop();
            System.out.print(temp.data+" ");
            if(temp.right!=null)
            s.push(temp.right);
            if(temp.left!=null)
            s.push(temp.left);
        }


    }
    public static void main(String args[])
    {
        preorderstack ps=new preorderstack();
        ps.root=new Node(1);
        ps.root.left=new Node(2);
        ps.root.left.left=new Node(4);
        ps.root.left.right=new Node(5);
        ps.root.right=new Node(3);
        ps.root.right.left=new Node(6);
        ps.root.right.right=new Node(7);
        ps.preorder(ps.root);
    }
    
}
