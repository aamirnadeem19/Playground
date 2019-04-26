import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
     int num;
      int i,fact,r;
    int sum=0;
      int n=sc.nextInt();
      num=n;
      while(n!=0)
      {
        i=1;
        fact=1;
        r=n%10;
        while(i<=r)
        {
          fact=fact*i;
          i++;
        }
        sum=sum+fact;
        n=n/10;
      }
          if(sum==num)
          {
             System.out.println("Yes");
          }
          else
          {
             System.out.println("No");
          }
	}
}