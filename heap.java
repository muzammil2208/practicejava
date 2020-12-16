import java.util.*;
public class heap {
    static Node root;
    public void sort()
    {
        Node temp=root;
        
    }
    public void levelordertraversal(Node root)
    {
        if(root==null)
        {
            System.out.println("tree is empty");

        }
        else
        {
            Queue<Node> que=new LinkedList<Node>();
            que.add(root);
            while(que.isEmpty()==false)
            {
                Node temp=que.peek();
                que.remove();
                System.out.print(temp.data+" ");
                if(temp.left!=null)
                que.add(temp.left);
                if(temp.right!=null)
                que.add(temp.right);
            }
        }
    }
    public void insert(int key)
    {
        if(root==null)
        {
            System.out.println(" tree doesnt exist");
            root=new Node(key);
        }
        else
        {
            Node temp=root;
            Queue<Node> q=new LinkedList<Node>();
            q.add(temp);
            while(!q.isEmpty())
            {
                temp=q.peek();
                q.remove();
                if(temp.left==null)
                {
                    temp.left=new Node(key);
                    break;

                }
                else
                q.add(temp.left);
                if(temp.right==null)
                {
                    temp.right=new Node(key);
                    break;
                }
                else
                q.add(temp.right);
                
               
            }

        }
        

    }
    public static void main(String args[])
    {
        heap h=new heap();
        root = new Node(10);
        root.left = new Node(11);
        root.left.left = new Node(7);
        root.right = new Node(9);
        root.right.left = new Node(15);
        root.right.right = new Node(8);
        h.insert(20);
        h.levelordertraversal(root);
    }
    
}
