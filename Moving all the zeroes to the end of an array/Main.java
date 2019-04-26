import java.util.Scanner;
class Main{
   public static void zeroes_at_the_end(int arr_size, int arr[])
    {
       
        int count = 0;
       for(int index = 0; index <= arr_size - 1; index++){
            if(arr[index] != 0)
            {
                int temp = arr[index];
                arr[index] = arr[count];
                arr[count] = temp;
                count++;
            }
        }
   }
    public static void main(String args[]) {
       // Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int a[] = new int[n];
      for(int i = 0; i < n; i++)
      {
           a[i] = sc.nextInt();
      }
      zeroes_at_the_end(n,a);
      for( int i = 0; i < n; i++)
      {
           System.out.print(a[i]+" ");
      }
    }

}