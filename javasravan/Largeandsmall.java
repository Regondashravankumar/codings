import java.util.Scanner;
 class Largeandsmall
{
	public static void main(String[] args) {
	    
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    a[i]=sc.nextInt();
		}
		int max=a[0],smal=a[0];
		for(int i=1;i<n;i++)
		{
		    if(a[i]>max)//12  13 15 16 11
		    {
		        max=a[i];
		        
		    }
		    
		}
		for(int i=1;i<n;i++)
		{
		    if(a[i]<smal)//12  13 15 16 11
		    {
		        smal=a[i];
		        
		    }
		    
		}
		System.out.println("max"+" "+max);
		System.out.println("small"+" "+smal);
	}
}
