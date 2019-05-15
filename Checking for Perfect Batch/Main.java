import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
a[i]=in.nextInt();
    }
if(a[3]==3)
{
System.out.println("Perfect Batch");
}
else
{
System.out.println("Not a Perfect Batch");
}

  }
}

  