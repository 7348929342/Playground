import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int fact=1,original,i,v,sum=0;
      original=n;
      while(n>0)
      {
        v=n%10;
        fact=1;
        for(i=1;i<=v;i++)
        {
fact=fact*i;
        }
        sum=sum+fact;
        n=n/10;
      }
      if(sum==original)
      {
        System.out.println("Yes");
      }
      else
      {
      System.out.println("No");
      }
    }
}