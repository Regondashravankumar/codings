import java.io.*;
import java.util.*;
class Reverse1
{
    public static void main(String[] args)
    {
        String str = "shravan", nstr=" ";
        char ch;
        System.out.println("original string:");
        System.out.println("shravan");
        for( int i=0; i<str.length(); i++)
        {
            ch=str.charAt(i);
            nstr=ch+nstr;
        
        }
        System.out.println("reverse String:"+nstr);
        
    }
}