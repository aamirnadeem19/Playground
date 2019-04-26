import java.util.*;
public class Main
{
    public static int power(int base, int expo)
  {
       int pow=1;
       while(expo >= 1)
       {
            pow=pow*base;
            expo--;
       }
       return pow;
  }
     public static void main(String args[])
     {
         Scanner sc=new Scanner(System.in);
         int a=sc.nextInt();
         int b=sc.nextInt();
         System.out.print(power(a,b));
     }
}


