import java.lang.*;
import java.util.Scanner;

class for_loop
{
  public static void main(String args[])
  {
    int a;
    int i;

    Scanner in = new Scanner(System.in);
    
    System.out.println("Enter a integer:");
    a = in.nextInt();
   
    for(i=0;i<a;i++)
    {
      System.out.println(+i);
    }
  }

}
