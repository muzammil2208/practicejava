import java.util.*;
public class inordersuccpress
{
    static int a[]=new int[100];
    static Node root;
    public void inorder(Node root)
    {
    
        
        if(root==null)
        {
         System.out.println("Tree doesnt exist");
        }
        else
        {
            Stack<Node> s=new Stack<Node>();
            Node temp=root;
            s.push(temp);
            int count=0;
            while(s.isEmpty()==false)
            {
               
                while(temp.left!=null)
                {
                    temp=temp.left;
                    s.push(temp);
                    
                }
                temp=s.pop();
                System.out.print(temp.data+ " ");
                a[count]=temp.data;
                count++;
                
                if(temp.right!=null)
                {
                    temp=temp.right;
                    s.push(temp);
                    
                    
                }
                

            }

        }
        
    }
    public void predecsucc(int key)
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==key)
            {
                if(i-1<0||a[i]==0)
                {
                    System.out.println("No predecessor or no successor");
                }
                else
                {
                    System.out.println("predecessor:"+a[i-1]);
                }
                
                System.out.println("successor:"+a[i+1]);
                break;
            }
        }
    }
    public static void main(String args[])
    {
        inordersuccpress i=new inordersuccpress();
        root=new Node(10);
        root.left=new Node(8);
        root.left.left=new Node(7);
        root.left.right=new Node(9);
        root.right=new Node(11);
        root.right.right=new Node(12);
        i.inorder(root);
        i.predecsucc(7);
    }
}