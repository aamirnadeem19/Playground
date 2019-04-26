import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      // Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int arr[] = new int[n];
      for(int i = 0; i < n; i++)
      {
           arr[i] = sc.nextInt();
      }
      int k = sc.nextInt();
      selection_sort(n , arr);
      System.out.print(arr[k-1]);
    }
   public static void selection_sort(int n, int a[])
   {
       for(int idx = 0; idx < n-1; idx++)
       {
            int max = find_max(idx, a, n-1);
            swap(idx, max, a);
       }
   }
  public static void swap(int idx, int max, int a[])
  {
       int temp = a[idx];
       a[idx] = a[max];
       a[max] = temp;
  }
  public static int find_max(int idx, int a[], int idx1)
  {
       int max = (a[idx] > a[idx+1]) ? idx: idx+1;
       for(int i = idx+2; i <= idx1; i++)
       {
           if(a[max] < a[i])
           {
               max = i;
           }
       }
      return max;
  }
 }
