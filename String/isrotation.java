import java.util.*;
public class isrotation
{
    public static void main(String args[])

    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string 1:");
        String s1=sc.next();
        System.out.println("enter a string 2;");
        String s2=sc.next();
        isrotation_func(s1,s2);


    }
    public static void isrotation_func(String s1,String s2)
    {
        String temp=s1+s1;
        if(s1.length()==s2.length()&&temp.indexOf(s2)!=-1)
        {
            System.out.println("it is a rotational string");

        }
        else
        {
            System.out.println("it is not a rotational string");
        }
    }

}