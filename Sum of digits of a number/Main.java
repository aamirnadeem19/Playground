import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n = sc.nextInt();
      int sum=0;
      int b=n;
      while(n!=0)
      { int r=n%10;
        sum=sum+r;
         n=n/10;
      }
      System.out.print(sum);
	}
}