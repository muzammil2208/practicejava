import java.util.*;
public class quicksort {

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
        partition(a,size-1,0);
        printarray(a);
    }
    public static void partition(int arr[],int high,int low)
    {   
           if(low<high)
           {
              int pi=sort(arr,high,low);
              partition(arr,pi-1,low);
                partition(arr,high,pi+1);
           }
           

    }   
    public static int sort(int arr[],int high,int low)
    {
       int i=low-1;
       int j;
       int pi=high;
       for(j=low;j<high;j++)
       {
           if(arr[j]<arr[pi])
           {
               i++;
               //swap with j
               int temp=arr[j];
               arr[j]=arr[i];
               arr[i]=temp;
           }
           else
           continue;
       }
       //swap the pivot element
       int temp=arr[pi];
       arr[pi]=arr[i+1];
       arr[i+1]=temp;
       return i+1;

    } 
    public static void printarray(int arr[])
    {
        System.out.println();
        for(int element:arr)
        {
            System.out.print(element+" ");
        }
        
    }
}
