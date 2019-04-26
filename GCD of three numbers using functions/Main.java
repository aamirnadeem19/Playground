import java.util.Scanner;
public class Main{
    public static int gcd(int a, int b)
    {   int hcf=0;
        int min=a>b?b:a;
      while(min!=0)
      {
          if((a%min==0) && (b%min==0))
          { 
            hcf=min;
            break;
          }
          min--;
      }
     return hcf;
    }
  
	public static void main (String[] args)
	{
	    // Type your code here
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        int hcf= gcd(x,y);
        int mini= hcf<z?hcf:z;
        int gcd1=0;
        while(mini!=0)
        {
             if((hcf%mini==0) && (z%mini==0))
             {
                gcd1=mini;
                break;
             }
             mini--;
        }
         System.out.print(gcd1);
	}
}