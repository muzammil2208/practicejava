import java.util.*;
public class firstnonrepeating
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
            arr[i]=sc.nextInt();

        find_nonrepeating(arr);
    }
    public static void find_nonrepeating(int arr[])
    {
       int count=0;
        for(int i=0;i<arr.length;i++)
        {
           for(int j=i+1;j<arr.length;j++)
           {
               if(arr[j]==arr[i])
               {
                   count++;
               }
               else
               continue;
           } 
            if(count<=0)
            {
                System.out.println("first non repeating operator is :"+arr[i]);
                break;
            }
            else
            continue;

        }
        
    }
}