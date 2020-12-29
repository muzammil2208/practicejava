import java.util.*;
public class heightoftree
{
  Node root;
  public static int height(Node root)
  {
    if(root==null)
    {
      return 0;
    }
    else
    {
      int height_var=0;
      Queue<Node> q=new ArrayDeque<Node>();
      q.add(root);
      while(true)
      {
        
        int nodecount=q.size();
        if(nodecount==0)
        return height_var;
        height_var++;
        while(nodecount>0)
        {
          Node newnode=q.peek();
          q.remove();
          if(newnode.left!=null)
          q.add(newnode.left);
          if(newnode.right!=null)
          q.add(newnode.right);
          nodecount--;
        }
      }


    }
  }
  public static void main(String args[])
  {
    heightoftree ht=new heightoftree();
    ht.root=new Node(1);
    ht.root.left=new Node(2);
    ht.root.right=new Node(3);
    ht.root.left.left=new Node(4);
    ht.root.left.right=new Node(5);
    System.out.println("height of tree is"+height(ht.root));
  }
}