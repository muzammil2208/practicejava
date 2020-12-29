import java.util.*;
public class cyclicrotation {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        
        for(int i=0;i<t;i++)
        {
            int size=sc.nextInt();
            int a[]=new int[size];
            for(int j=0;j<size;j++)
            a[j]=sc.nextInt();
            cyclicrotationfunc(a);
        }
    }
    public static void cyclicrotationfunc(int a[])
    {
        for(int i=a.length-1;i>0;i--)
        {
            int temp=a[i];
            a[i]=a[i-1];
            a[i-1]=temp;
        }
        for(int element:a)
            System.out.print(element);
    }
}
