import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
        int n, x, flag = 0, i = 0,hg=0,y;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int a[] = new int[n];
        for(i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
      
        x = s.nextInt();
        for(i = 0; i < n; i++)
        {
            if(a[i] == x)
            {
                flag = 1;
                break;
            }
            else
            {
                flag = 0;
            }
        }
        if(flag == 1)
        {
            System.out.println(i);
        }
        else
        {
            System.out.println("-1");
        }
      y = s.nextInt();
        for(i = 0; i < n; i++)
        {
            if(a[i] == y)
            {
                hg = 1;
                break;
            }
            else
            {
                hg = 0;
            }
        }
        if(hg == 1)
        {
            System.out.println(i );
        }
        else
        {
            System.out.println("-1");
        }
    
    
        
    }
}