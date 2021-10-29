import java.lang.*;
import java.util.Scanner;

class primenum
{
  public static void main(String args[])
  {
    int m,n,i,j;

    Scanner in = new Scanner(System.in);
    System.out.println("Enter the 1st number:");
    m = in.nextInt();
    System.out.println("Enter the 2nd number:");
    n = in.nextInt();
    for(i = m; i <= n; i++)
    {
      int flag = 0;
      for(j = 2; j < n/2; j++)
      {
        if(i%j == 0)
        flag = 1;
        break;
      }
      if(flag == 0)
      System.out.println(i);
    }
   }
}
    