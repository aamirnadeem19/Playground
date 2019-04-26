import java.util.Scanner;
class Main{
    public static int sum(int n)
    {   int i=1, sum=0;
        while(i<=n)
        {
          sum=sum+i;
          i++;
        }
     return sum;
    }
	public static void main (String[] args){
	    // Type your code here
      Scanner sc= new Scanner(System.in);
      int n=sc.nextInt();
      int add=sum(n);
      System.out.print(add);
	}
}