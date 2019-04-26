import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //Try your logic here
      Scanner sc = new Scanner(System.in);
      int base = sc.nextInt();
      int expo = sc.nextInt();
      int pow = 1;
      while(expo > 0)
      {
          pow *= base;
          expo --;
      }
      System.out.println(pow);
     
    }
}