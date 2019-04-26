import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	 // Type your code here   
      Scanner sc=new Scanner(System.in);
      int n1=sc.nextInt();
      int sq= square(n1);
      System.out.print(sq);
	} 
  public static int square(int n)
  {
    int s=n*n;
    return s;
  }
  
}