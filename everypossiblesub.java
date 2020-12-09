import java.util.*;
public class everypossiblesub {
    public static boolean palindrome(String str)
    {
        
        String strcopy="";
        for(int i=str.length()-1;i>=0;i--)
        strcopy=strcopy+str.charAt(i);
        if(str.equalsIgnoreCase(strcopy)==true)
        return true;
        else
        return false;

    }
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int low,high;
        int maxlength=0;
        low=high=0;
        for(int i=0;i<s.length();i++)
        {
            low=0;
            high=i+1;
            while(high<=s.length())
            {
                
                if(palindrome(s.substring(low,high))==true)
                {
                    if(maxlength<(high-low))
                    maxlength=high-low;


                }
                low++;
                high++;
                
            }
        }
        System.out.println(maxlength);
    }
}
