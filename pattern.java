import java.lang.*;
import java.util.Scanner;
class pattern
{
  public static void main(String args[])
  {
   int n;
   Scanner in = new Scanner(System.in);
   System.out.println("Enter the number:");
   n = in.nextInt();
   
   int k = 1;
   int i,j;
   for(i = 0;i < n; i++)
      { for(j = 0; j <= i; j++)
         System.out.print(k++ + " ");
       System.out.println();
    }
   }
}