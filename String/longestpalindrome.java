import java.util.*;
public class longestpalindrome {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            String s=sc.next();
            longest(s);
        }
        
    }
    public static void longest(String s)
    {
        String longest="";
        for(int i=1;i<=s.length();i++)
        {
            for(int j=0;j+i<=s.length();j++)
            {
                if(palindrome(s.substring(j,j+i)))
                {
                    String newsub=s.substring(j,j+i);
                    if(newsub.length()>longest.length())
                    {
                        longest=s.substring(j,j+i);
                    }
                    
                }
                else
                continue;
            }
        }
        System.out.println(longest);

    }
    public static boolean palindrome(String s)
    {
        int last=s.length()-1;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(last)==s.charAt(i))
            {
                last--;
                continue;
                
            }
            else
            return false;
         
            
        }
        return true;
    }
}
