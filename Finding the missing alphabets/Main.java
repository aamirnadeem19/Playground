import java.util.Scanner;
class Main{
    public static void main(String args[]){
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
      for(int i =0; i < 26; i++)
      {
           if(stat[i] == 0)
           {
                char max_char = (char)('a' + i);
                System.out.print(max_char+ " ");
           }
      }
    }
}