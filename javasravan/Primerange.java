import java.util.*;
class Primerange
{   
  public static void main(String[] args) 
   {
     Scanner sc = new Scanner(System.in);
     int num=sc.nextInt();
     int count;
  for (int i = 2; i <= num; i++)         
  {
   count = 0;
   for (int j = 2; j <= i / 2; j++)
   {
    if (i % j == 0)
    {
     count++;
     
    }
   }

   if (count == 0) {
    System.out.println(i);
   }

  }
 }
}

