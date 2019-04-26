import java.util.Scanner;
class Main{
   public static void subset(int n, int a[])
   {
        for(int i =0; i<n-1;i++)
        {
             for(int j =i+1; j<n;j++)
             {
                  for(int k =j+1; k<n;k++)
                  {
                       System.out.print("("+a[i]+","+" "+a[j]+","+" "+a[k]+")"+" ");
                  }
             } 
             System.out.println();
        }
   }
    public static void main(String args[]) {
       // Type your code here
         Scanner sc= new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];
    for(int i =0; i<n;i++)
    {
        a[i] = sc.nextInt();
    }
      subset(n,a);
    }
}