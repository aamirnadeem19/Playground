import java.util.*;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    System.out.print(sum(num));
  }
  public static int sum(int n)
  {
      if(n != 0)
      {
           return n + sum(n - 1);
      }
      else
      return n;
  }
}