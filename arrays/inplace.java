import java.util.*;
import java.math.*;
public class inplace
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        findenegativeandarrang(a);
        System.out.println(10-20);

    }
    public static void findenegativeandarrang(int arr[])
    {
        int size=0;
        int size1=0;
       
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<0)
            {
                size++;
            }
            else
            {
                size1++;
            }
        }
        int b[]=new int[size];
        int c[]=new int[size1];
        int count=0;
        int count1=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<0)
            {
             b[count]=arr[i];
             count++;   
            }
            else{
                c[count]=arr[i];
                count1++;
            }
        }
        int d[]=new int[size+size1];
        for(int i=0;i<)

    }
}