import java.util.Scanner;
class Palinstring
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        String s = sc.nextLine();
        StringBuffer str = new StringBuffer(s);
        String rev = str.reverse().toString();
        if(s.equals(rev))
          System.out.println("Palindrome:");
        else
          System.out.println("Not Palindrome:");
        
    }
}