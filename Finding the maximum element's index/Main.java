import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
     Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
		arr[i]=in.nextInt();
    }
    int large=arr[0];
    int index=0;
	for(int i=0;i<n;i++)
    {
		if(large<arr[i])
        {
			large=arr[i];
          index=i;
         
        }
    }
    System.out.println(index);
  }
}

       
    

  
