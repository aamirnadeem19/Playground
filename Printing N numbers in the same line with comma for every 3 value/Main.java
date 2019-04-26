import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   //Type your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=3;
    for(int count=1;count<=n;count++)
    {
        System.out.print(count);
      {
          if((count%m==0)&&(count!=n))
          {
            System.out.print(",");
          }
      }
    }
  }
}