import java.util.*;
public class largestthreeelement {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("You have to enter size greater than 3");
        
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        largest3(arr);
    }
    public static void largest3(int arr[])
    {
        int a=0;
        int b=1;
        int c=3;
        for(int i=4;i<arr.length;i++)
        {
            if(arr[a]<arr[i])
            {
                int temp=arr[a];
                arr[a]=arr[i];
                arr[i]=temp;
            }
            if(arr[b]<arr[i])
            {
                int temp=arr[b];
                arr[b]=arr[i];
                arr[i]=temp;
            }
            if(arr[c]<arr[i])
            {
                int temp=arr[c];
                arr[c]=arr[i];
                arr[i]=temp;
            }
        }
        System.out.println("three largest elements are"+arr[a]+" "+arr[b]+" "+arr[c]);
    }
}
