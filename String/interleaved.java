import java.util.*;
public class interleaved {
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        String c=sc.next();
        if(isinterleaved(a,b,c))
        {
            System.out.println("strings is interleaving..");

        }
        else
        {
            System.out.println("String is not interleaving...");
        }
       
        
    }
    public static boolean isinterleaved(String a,String b,String c)
    {
        int counta=0;
        int countb=0;
        
        for(int i=0;i<c.length();i++)
       {
           if(c.charAt(i)==a.charAt(counta))
           {
            counta++;
            continue;
           }
           
           else if(c.charAt(i)==b.charAt(countb))
           {
            countb++;
            continue;

           }
          
           else
           return false;
       }
       return true;
    }
    
}
