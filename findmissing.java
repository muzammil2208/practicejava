import java.util.*;
public class findmissing {
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
            findmissingfunc(a);
        }
    }
    public static void findmissingfunc(int a[])
    {
        
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==i+1)
            {
                continue;
            }
            System.out.print(i+1+" ");
            break;
        }
        System.out.println();
    }
}
