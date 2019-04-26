import java.util.*;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    System.out.print(fact(num));
  }
  public static int fact(int n)
  {
       if(n == 0)
       {
           return 1;
       }
       else
        return n * fact(n-1);
  }
  }
  
