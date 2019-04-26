import java.util.*;
class Main
{
   public static int stringToint( String str ){
        int i = 0, number = 0;
        boolean isNegative = false;
        int len = str.length();
        if( str.charAt(0) == '-' ){
            isNegative = true;
            i = 1;
        }
        while( i < len ){
            number *= 10;
            number += ( str.charAt(i++) - '0' );
        }
        if( isNegative )
        number = -number;
        return number;
    }   

  public static void main(String args[])
  {
    // type your code here
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    
    System.out.print(stringToint(s));
  }
}