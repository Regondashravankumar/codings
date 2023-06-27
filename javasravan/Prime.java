import java.util.Scanner;
class Prime
{   
    public static void main(String[] args)
    {
        int m,flag=0;
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        m=n/2;
        if(n==0||n==1)
        {
           System.out.print("not prime:");
        }
        for(int i=2; i<=m; i++)
        {
            if(n%2==0)
            {
              flag=1;
            }
        }
        if(flag==0)
       {
            System.out.println(" prime ");
        }
        else
           System.out.println("not prime");
           
    }
}
       
       
       
       
       
       