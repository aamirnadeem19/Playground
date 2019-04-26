import java.util.Scanner;
class Main
{
  public static void check_batch( int arr[], int n)
  {
      int sum = arr[0] + arr[1] + arr[2];
      int sum1 = 0, flag = 0;
      for(int i=3 ;i<n; i+=3)
      {
          sum1 = arr[i] + arr[i+1] + arr[i+2];
          if(sum !=sum1)
          flag=1;
      }
      
      if( flag==0)
          System.out.println("Perfect Batch");
      else
          System.out.println("Not a Perfect Batch");
  }
  
  public static void main(String args[])
  {
    //Try your code here
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i] = sc.nextInt();
    }
    check_batch(arr,n);
  }
}