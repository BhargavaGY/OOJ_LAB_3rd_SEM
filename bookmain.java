import java.util.Scanner;
import java.lang.*;

class book
{
 String name, author;
 float price;
 int pages;
 Scanner in = new Scanner(System.in);
 
 void get_data()
 {
  in.nextLine();
  System.out.println("Name of the book:");
  name = in.nextLine();
  in.nextLine();
  System.out.println("Name of the Author:");
  author = in.nextLine();
  System.out.println("Price:");
  price = in.nextFloat();
  System.out.println("Number of pages:");
  pages = in.nextInt();
 }
 book()
 {
   name = "";
   author = "";
   price = 0;
   pages = 0;
 }

 public String toString()
 {
  return("Book details:\nName: " + name + "\tAuthor: " + author + "\tPrice: " + price + "\tPages: " + pages);
 }

}

class bookmain
{
  public static void main(String args[])
  { 
    int n;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the number of books:");
    n = in.nextInt();
    
     
    book array[] = new book[n];  
  
    for(int i = 0; i < n; i++)
    {
      array[i] = new book();
      array[i].get_data();
    }
  
    for(int i = 0; i < n; i++)
    { 
      System.out.println(array[i]);
    }
  }
}
