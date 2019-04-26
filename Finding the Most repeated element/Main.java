import java.util.*;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i = 0; i < n; i++)
    {
        arr[i] = sc.nextInt();
    }
  int count = 0, curr_cnt = 1, freq_num = 0, key = 0;
for(int i = 0; i < n-1; i++)
{
    key = arr[i];
    for(int j =i+1; j < n; j++)
    {
        if(key == arr[j] && freq_num != key)
        {
            curr_cnt++;
        }
    }
    if(count < curr_cnt)
    {
        count = curr_cnt;
        curr_cnt = 1;
        freq_num = key;
    }
   
}
    System.out.print(freq_num);
  }
}
