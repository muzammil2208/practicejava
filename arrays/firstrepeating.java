import java.util.*;
public class firstrepeating
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
            arr[i]=sc.nextInt();

        find_repeating(arr);
    }
    public static void find_repeating(int arr[])
    {
       
        for(int i=0;i<arr.length;i++)
        {
           for(int j=i+1;j<arr.length;j++)
           {
               if(arr[j]==arr[i])
               {
                   System.out.println("first repeating element is:"+arr[j]);
               }
               else
               continue;
           } 

        }
        
    }
}