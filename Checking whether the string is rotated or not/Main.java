import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
      Scanner sc = new Scanner (System.in);
      String s1 = sc.nextLine();
      String s2 = sc.nextLine();
      String temp = " ";
      temp = s1.concat(s1);
      if(temp.contains(s2))
      {
          System.out.print("Yes");
       }
       else
       {
           System.out.print("No");
        }
    }
}
      
           
           
      