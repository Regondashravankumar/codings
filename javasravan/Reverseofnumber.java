import java.util.Scanner;
class Reverseofnumber
{
    public static void main(String[] args)
    {
        int n,reverse=0,r;
        Scanner sc = new Scanner(System.in);
         n = sc.nextInt();
        while(n!=0)
        {
            r=n%10;
            reverse=reverse*10+r;
            n=n/10;
        }
        System.out.println("reverse :"+ reverse);
    }
}