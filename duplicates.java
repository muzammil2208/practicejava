import java.util.*;
public class duplicates
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int size=sc.nextInt();
        System.out.println("enter the element of the array:");
        int a[]=new int[size];
        for(int i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }
        duplicates_func(a);
    }
    public static void duplicates_func(int a[])
    {
        System.out.print("duplicates are:");
        int size=a.length;
        for(int i=0;i<size;i++)
        {
            
            for(int j=i+1;j<size;j++)
            {
                if(i!=j)
                {
                    if(a[i]==a[j])
                    {
                       System.out.print(a[i]+" ");
                        
                    }

                }
               
                
            }
            
        }
        System.out.println();
    }
}