import java.util.Scanner;
class Main{ 
    public static int isPrime(int n)
    {
         int flag=1;
         for(int i=2;i<=n/2;i++)
         {
             if(n%i==0)
             {
                 flag=0;
                 break;
             }
           }
          return flag;
    }
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int check=sc.nextInt();
      for(int i=2;i<=check;i++)
      {
         int flag=isPrime(i);
         if(flag==1)
         System.out.println(i);
      }
   }
}
