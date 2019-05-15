import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int i=1,count=0;
     while(n>count)
     {
       if(i%2==1)
       {
         System.out.println(i);
         count=count+1;
        }
       i++;
     }
    }
}
