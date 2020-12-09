import java.util.*;
class inorderstack 
{
    Node root;
   
    public void inorder(Node root)
    {
        int edges;
        int hr;
        int hl;
        if(root==null)
        {
            System.out.println("Tree is empty");
            hr=hl=0;
            edges=0;
            return;
        }
        else
        {
            edges=0;
            hr=hl=0;
            Stack<Node> s=new Stack<Node>();
            Node temp=root;
            s.push(temp);
            while(s.isEmpty()==false)
            {
                while(temp.left!=null)
                {
                    temp=temp.left;
                    s.push(temp);
                    edges++;
                }
                temp=s.pop();
                
                if(temp.right==null)
                {
                    System.out.print(temp.data);
                }
                else
                {
                    temp=temp.right;
                    s.push(temp);
                    edges++;
                    hr++;
                }
              

            }
           
            if(hr-hl<=1)
            System.out.println("balancd tree");
            else
            System.out.println("Unbalanced");
            System.out.println("height of the tree is"+edges/2);

        }
    }
    public static void main(String args[])
    {
        inorderstack i=new inorderstack();
        i.root=new Node(1);
        i.root.left=new Node(2);
        i.root.left.left=new Node(4);
        i.root.left.right=new Node(5);
        i.root.left.right.right=new Node(6);
        i.root.right=new Node(3);
        i.inorder(i.root);

    }
}