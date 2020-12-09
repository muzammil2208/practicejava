import java.util.LinkedList;
import java.util.Queue;



public class binarysearchtree {
    static Node root;
    public void insert(Node root,int key)
    {
        
        if(root==null)
        root=new Node(key);
        else
        {
            Node newnode=new Node(key);
            Node temp=root;
            while(temp!=null)
            {
                if(key<temp.data)
                    if(temp.left==null)
                    {
                        temp.left=newnode;
                        break;

                    }
                    else
                    temp=temp.left;
                else if(key>temp.data)
                    if(temp.right==null)
                    {
                        temp.right=newnode;
                        break;
                    }
                    
                    else
                    temp=temp.right;
            }
           
        }
    }
    public void levelordertraversal(Node root)
    {
        if(root==null)
        {
            System.out.println("tree is empty");

        }
        else
        {
            Queue<Node> q=new LinkedList<Node>();
            q.add(root);
            while(q.isEmpty()==false)
            {
                Node temp=q.peek();
                q.remove();
                System.out.print(temp.data+" ");
                if(temp.left!=null)
                q.add(temp.left);
                if(temp.right!=null)
                q.add(temp.right);
            }
        }
    }
   public void delete(int key)
   {
       if(root==null)
       {
           System.out.println("tree is empty");
       }
       else
       {
        Node temp=root;
           while(true)
           {
            
            if(key<temp.data)
            {
                if(temp.left.data==key)
                {
                    temp.left.left.right=temp.left.right;
                    temp.left=temp.left.left;
                    break;
                }
                else
                temp=temp.left;   
            }
            else if(key>temp.data)
            {
                if(temp.right.data==key)
                {
                    temp.right.right.right=temp.right.right;
                    temp.right=temp.right.right;
                    break;
                }
                else
                temp=temp.right;
            }
           
           }
          
       }
       
   } 
    public static void main(String args[])
    {
        binarysearchtree bs=new binarysearchtree();
        root=new Node(100);
        root.left=new Node(20);
        root.right=new Node(500);
        bs.insert(root,1);
        bs.insert(root,30);
        bs.insert(root,900);
        bs.delete(100);
        
        bs.levelordertraversal(root);
    }
}
