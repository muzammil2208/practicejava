import java.util.*;
public class postorderstack {
    Node root;
    public void postorder(Node root)
    {
        if(root==null)
        System.out.println("Tree is emptlY");
        else
        {
            Stack<Node> s1=new Stack<Node>();
            Stack<Node> s2=new Stack<Node>();
            s1.push(root);
            while(!s1.isEmpty())
            {
               Node temp=s1.pop();
               s2.push(temp);
               if(temp.left!=null)
               s1.push(temp.left);
               if(temp.right!=null)
               s1.push(temp.right);

            }
            while(!s2.isEmpty())
            {
                Node temp=s2.pop();
                System.out.print(temp.data+" ");
            }
        }
    }
    public static void main(String args[])
    {
        postorderstack p=new postorderstack();
        p.root=new Node(1);
        p.root.left=new Node(2);
        p.root.left.left=new Node(4);
        p.root.left.right=new Node(5);
        p.root.left.right.right=new Node(6);
        p.root.right=new Node(3);
        p.postorder(p.root);

    }
}
