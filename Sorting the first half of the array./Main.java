import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int list[] = new int[n];
    for(int i = 0; i < n; i++)
    {
        list[i] = sc.nextInt();
    }
    int m = n/2;
    for(int i = 0; i < m-1 ;i++)
    {
        for(int j = 0; j < m-1-i; j++)
        {
            if(list[j] > list[j+1])
               {
                   int temp = list[j];
                   list[j] = list[j+1];
                   list[j+1] = temp;
               }
        }
    }
    for(int i = 0; i < n; i++)
    {
       System.out.print(list[i]+ " ");
    }
  }
}
