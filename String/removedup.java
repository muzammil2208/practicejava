import java.util.*;
public class removedup {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string to remove the duplicates:");
        String str=sc.next();
        char s[]=str.toCharArray();
        removeduplicates(s);
    }
    public static void removeduplicates(char s[])
    {
        char copy[]=new char[s.length];
        int count=0;
        int index=0;
        for(int i=0;i<s.length;i++)
        {   count=0;
            for(int j=0;j<copy.length;j++)
            {
                if(s[i]==copy[j])
                count++;
                
            }
            if(count<1)
                {
                    copy[index]=s[i];
                    index++;
                }
                
                else
                continue;
           
        }
        for(char element:copy)
        {
            System.out.print(element);
        }
       
    }

}
