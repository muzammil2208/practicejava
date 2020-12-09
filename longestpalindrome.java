import java.util.*;
public class longestpalindrome {
    public static String palindrome(String str)
    {
        
        String strcopy="";
        for(int i=str.length()-1;i>=0;i--)
        strcopy=strcopy+str.charAt(i);
        if(str.equalsIgnoreCase(strcopy)==true)
        return strcopy;
        else
        return "not a palindrome";

    }
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
     String s=sc.next();
     for(int i=0;i<s.length();i++)
     for(int j=i;j<s.length();j++)
    }
    
}
