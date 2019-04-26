import java.util.Scanner;
class Main
{
 
  public static void main(String args[])
  {
    //type your code here
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    String s1 = s.replaceAll("[AEIOUaeiou]", "");
         System.out.print(s1);
    
  }
}