import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	   // Type your code here
      Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
        int n2=in.nextInt();
        int n3=in.nextInt();
      int a=0,b=0,i;
      if(n1>n2)
      {
        for(i=1;i<n1;i++)
        {
          if(n1%i==0&&n2%i==0)
          {
            if(a<i)
              a=i;
          }
        }
      }
      else
      {
        for(i=1;i<n2;i++)
        {
          if(n1%i==0&&n2%i==0)
          {
            if(a<i)
              a=i;
          }
        }
      }
      if(n3>a)
      {
      for(i=1;i<n3;i++)
        {
          if(n3%i==0&&a%i==0)
          {
            if(b<i)
              b=i;
          }
      }
      }
      System.out.println(b);
	}
}