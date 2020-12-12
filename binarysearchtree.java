
import java.util.*;


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
        //searching algorithm
        Node deletenode;
        deletenode=null;
        Node temp=root;
        while(temp!=null)
        {
           
            if(temp.data==key)
            {
                deletenode=temp;
                break;
            }
            else if(key<temp.data)
            {
                if(temp.left.data==key)
                {
                    deletenode=temp.left;
                    break;
                }
                else
                temp=temp.left;
            }
            else if(key>temp.data)
            {
                if(temp.right.data==key)
                {
                    deletenode=temp.right;
                    break;
                }
                else
                temp=temp.right;
            }
            
        }
        //deletion logic
        //case 1 where node might not exist
        if(deletenode==null)
        {
            System.out.println("The node node found inside the tree");
        }
        //case 2 where node might be the leaf node
        if(deletenode.left==null&&deletenode.right==null)
        {
            if(key<temp.data)
            {
                temp.left=null;
            }
            else if(key>temp.data)
            {
                temp.right=null;
            }
         }
         //case 3 where node might contain only one node either left or right
        else if(deletenode.left==null||deletenode.right==null)
        {
            if(deletenode.left!=null)
            temp.left=deletenode.left;
            else if(deletenode.right!=null)
            temp.right=deletenode.right;
        }
        //case 4 where node might contain both left and right child nodes
        else if(deletenode.left!=null&&deletenode.right!=null)
        {
           Node min=findminimum(deletenode);
           
           delete(min.data);
           deletenode.data=min.data;
            
        }



    }
    public static Node findminimum(Node root)
    {
        
        Node temp=root.right;
        //becase finding minimum from the right subtree for deletiong
       
        while(temp.left!=null)
        {
            temp=temp.left;
        }
        return temp;

    }
    public void minimummaximum(Node root)
    {
        int min=root.data;
        int max=root.data;
        Node temp=root;
        while(temp.left!=null)
        {
            
            temp=temp.left;
            min=temp.data;
        }
        temp=root;
        while(temp.right!=null)
        {
            
            temp=temp.right;
            max=temp.data;
        }
        System.out.println("Maximum in  tree is"+max);
        System.out.println("Minimum in tree is"+min);
    }
    public void inorder(Node root)
    {
        if(root==null)
        return; 
        else
        {
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }
    public void preorder(Node root)
    {
        if(root==null)
        return;
        else
        {
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
    }
    public void postorder(Node root)
    {
        if(root==null)
        return;
        else
        {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }
    }
    public void findarray(Node root)
   {
       if(root==null)
       return;
       int a[]=new int[100];
       findallpaths(root,a,0);
   }
    public void findallpaths(Node root,int arr[],int index)
    {
        if(root==null)
        return;
        arr[index]=root.data;
        if(root.left==null&&root.right==null)
        {
           for(int i=0;i<=index;i++)
           System.out.print(arr[i]+" ");
           System.out.println();

        }
        findallpaths(root.left,arr,index+1);
        findallpaths(root.right,arr,index+1);
       
    }
    
    public boolean isbst(Node root)
    {
        if(root==null)
       return false;
        else
        {
            Stack<Node> s=new Stack<Node>();
            s.push(root);
            Node temp=root;
            while(s.isEmpty()==false)
            {
                if(temp.left==null&&temp.right==null)
                break;
                else if(temp.left!=null&&temp.right==null)
                {
                    if(temp.data>temp.left.data)
                    {
                        temp=temp.left;
                    }
                    else
                    {
                        return false;
                        
                    }
                }
                else if(temp.right!=null&&temp.left==null)
                {
                    if(temp.right.data>temp.data)
                    {
                        temp=temp.right;
                    }
                    else
                    return false;
                }
                else if(temp.right!=null&temp.left!=null)
                {
                    if(temp.right.data>temp.data&&temp.left.data<temp.data)
                    {
                        s.push(temp.right);
                        temp=temp.left;
                    }
                    else
                    return false;
                }
            }
            return true;
        }
    }
    public static void main(String args[])
    {
        binarysearchtree bs=new binarysearchtree();
        root=new Node(100);
        root.left=new Node(200);
        root.right=new Node(500);
        bs.insert(root,1);
        bs.insert(root,0);
        bs.insert(root,2);
        bs.insert(root,30);
        bs.insert(root,900);
 
        
        bs.levelordertraversal(root);
        bs.minimummaximum(root);
        System.out.println();
        bs.postorder(root);
        System.out.println();
        bs.preorder(root);
        System.out.println();
        bs.inorder(root);
        System.out.println(bs.isbst(root));
        
        
    }
}
