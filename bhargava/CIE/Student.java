package CIE;

import java.util.Scanner;

class Internals extends Student
{
  Internals()
  {
    super();
  }
  void accept()
  {
    double marks[] = new double[5];
    Scanner in = new Scanner(System.in);
  
    for(int i = 0; i < 5; i++)
    {
       System.out.println("Enter the marks of subject " +(i+1));
       marks[i] =  in.nextDouble();
    }
  }
}

class Student
{
   String name, usn, sem;
   Scanner in = new Scanner(System.in);
   
   Student()
   {
     System.out.println("Enter the name: ");
     name = in.nextLine();
     System.out.println("Enter the USN ");
     usn = in.nextLine();
     System.out.println("Enter the semester: ");
     sem = in.nextLine();
   }
   
   public static void main(String args[])
   {
      Internals s = new Internals();
      s.accept();
   }
}