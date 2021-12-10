package SEE;

import CIE.*;

import java.util.Scanner;

class Externals extends CIE.Student
{
 
  void accept()
  {
    double see_marks[] = new double[5];
    Scanner in = new Scanner(System.in);
  
    for(int i = 0; i < 5; i++)
    {
       System.out.println("Enter the marks of subject " +(i+1));
       see_marks[i] =  in.nextDouble();
    }
  }
  
  public static void main(String args[])
  {
    Externals e = new Externals();
    e.accept();
  }
}