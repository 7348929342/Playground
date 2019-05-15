import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int sum=0,remain;
      while(n!=0)
      {
        remain=n%10;
        sum=sum+remain;
        n=n/10;
	}
      System.out.println(sum);
}
}