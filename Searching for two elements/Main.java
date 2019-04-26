import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner sc= new Scanner (System.in);
      int n=sc.nextInt();
      int arr[] = new int[n];
      for(int i=0;i<n;i++)
      {
          arr[i] = sc.nextInt();
      }
      int search1 = sc.nextInt();
      int search2 = sc.nextInt();
      int element1 = -1;
      int element2 = -1;
      for(int i=0;i<n;i++)
      {
          if(search1 == arr[i])
          {
              element1 = i;
          }
        }
       System.out.println(element1);
      for(int i=0;i<n;i++)
      {
          if(search2 == arr[i])
          {
              element2 = i;
          }
      }
      System.out.println(element2);
    }
}