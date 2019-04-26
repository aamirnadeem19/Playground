import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
         String s = sc.nextLine();
         String words[] = s.split(" ");
         String ReverseWord = "";
    for(int j = words.length - 1; j >= 0; j --)
        	 {
        		 ReverseWord = ReverseWord + words[j] + " ";
        	 }
        System.out.print(ReverseWord);
	}

    }
    // Function to reverse a string
   