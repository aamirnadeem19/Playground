import java.util.Scanner;
class Main
{
 public static int max(int arr[], int n)
  {
       int max=0;
       for(int i=0;i<n;i++)
       {
           max = arr[0] > arr[1] ? 0 : 1;
       }
       for(int i=2;i<n;i++)
       {
          max = arr[max] > arr[i] ? max : i;
       }
    return max;
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
    System.out.println(max(arr,n));
  }
}