import java.util.Scanner;
class Main{
	public static void main(String[] args) 
  	{ 
      // Type your code here 
      Scanner sc = new Scanner(System.in);
      String s1 = sc.nextLine();
      String s2 = sc.nextLine();
      String s3 = sc.nextLine();
      System.out.print(s1.replace(s2,s3));
    }
}