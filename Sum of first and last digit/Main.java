import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n = sc.nextInt();
      int r=n%10;
      int b=n;
      while(b>=10)
      {
         b=b/10;
      }
      int sum=r+b;
      System.out.print(sum);
	}
}