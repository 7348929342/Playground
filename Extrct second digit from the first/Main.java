import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int b,c;
        while(n>=100)
        {
          n=n/10;
        }
      b=n;
      c=b%10;
      System.out.println(c);
	}
}