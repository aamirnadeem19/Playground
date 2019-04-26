import java.util.Scanner;
class Main{
  public static int greatest(int a, int b)
  {
      int c= a>b?a:b;
      return c;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int x=sc.nextInt();
      int y=sc.nextInt();
      int z=sc.nextInt();
      int d=greatest(x,y);
      int last= d>z?d:z;
      System.out.print(last);
	}
}