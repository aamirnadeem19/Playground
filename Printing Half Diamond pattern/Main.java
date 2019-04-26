import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      
      for(int i=1;i<=n;i++)
      {
           for(int j=1;j<2*n;j++)
          {
               if(j>=(n+1)-i && j<=(n-1)+i)
               System.out.print("*");
                  else
                    System.out.print(" ");
          }
        System.out.print("\n");
      }
	}
}