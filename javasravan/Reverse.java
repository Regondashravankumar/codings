import java.util.*;
class Reverse
{
   public static void main(String[] args) 
   {
       
      Scanner sc = new Scanner(System.in);
       String str1 = sc.nextLine();
       char str[] = str1.toCharArray();
       int n = str.length; 
       ArrayList<Character> list = new ArrayList<>();
       for(int i=0;i<n;i++)
       { 
           list.add(str[i]);
       }
       Collections.reverse(list); 
       int size = list.size(); 
       System.out.print("Reversed string: ");
       for(int i=0;i<size;i++)
       {
           
           System.out.print(list.get(i));
       }
   }
}