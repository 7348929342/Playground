import java.util.Scanner;
class Main{
	public static void main (String[] args){
	     // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int  i,j=0;
      for(i=0;i<=n;i++)
      {
        j=j+i;
      }
      System.out.println(j);
	}
}