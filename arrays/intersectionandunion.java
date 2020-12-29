    import java.util.*;
    public class intersectionandunion {
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            for(int i=0;i<t;i++)
            {
                int m=sc.nextInt();
                int n=sc.nextInt();
                int k=sc.nextInt();
                int a[]=new int[m];
                int b[]=new int[n];
                int c[]=new int[k]; 
                for(int j=0;j<m;j++)
                a[j]=sc.nextInt();
                for(int j=0;j<n;j++)
                b[j]=sc.nextInt();
                for(int l=0;l<k;l++)
                c[l]=sc.nextInt();
                System.out.println("Intersection");
                intersection(a,b,c);
                System.out.println("Union");
                
            }
            
            
        }
        public static void union(int a[],int b[])
        {
            int size=a.length;
            size=size+b.length;
            int m=0;
            int n=0;
            for(int i=0;i<size;i++)
            {
                if(m<a.length)
                {
                    System.out.print(a[m]+" ");
                    
                    m++;
                }
                else
                {
                    int count=0;
                    for(int element:a)
                    {
                    if(element==b[n])
                    count++;

                    }
                    if(count<=0)
                    System.out.print(b[n]+" ");
                    
                    n++;
                }
            }
            

        }
        public static void intersection(int a[],int b[],int c[])
        {
            
            for(int aelement:a)
            {
                for(int belement:b)
                {
                    for(int celement:c)
                    if(aelement==belement&&aelement==celement&&belement==celement)
                    System.out.print(aelement+" ");
                }
            }

        }
    }
