import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int i,j,c;
      for(i=2;i<=n;i++)
      {
        c=0;
        for(j=2;j<i;j++)
        {
         if(i%j==0)
         {
       c++;
           break;
         }
        }
       if(c==0)
       {
       System.out.println(i);
       }}
	}
}