import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
     
		
		 Scanner sc = new Scanner(System.in);
	      String s = sc.nextLine();
	      StringBuilder sb = new StringBuilder(s);
	      StringBuilder temp = new StringBuilder(sb);
	      StringBuilder rev = new StringBuilder("");
	      rev = sb.reverse();
	      if(temp.toString().equals(rev.toString()))
	      {
	    	  System.out.println("Yes");
	      }
	      else
	      {
	    	  System.out.println("No");
	      }

	}

    } 
