import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
         Scanner sc = new Scanner(System.in);
      String s = sc.nextLine();
      int len = s.length();
      int stat[] = new int[26];
      for(int i = 0; i < 26; i++)
      {
          stat[i] = 0;
      }
      for(int i = 0; i < len; i++)
      {
           if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
           {
               int ch = s.charAt(i) - 'a';
               stat[ch]++;
           }
           else if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
           {
               int ch = s.charAt(i) - 'A';
               stat[ch]++;
           }
      }
      String s1= s.toLowerCase();
      for(int i =0; i< len; i++)
      {
           char ch = s1.charAt(i);
           int x = (ch - 'a');
           if(stat[x] != 0)
           {
               
               System.out.print(ch);
               System.out.print(stat[x]+ " ");
               stat[x] = 0;
           }
           
      }
    }
}