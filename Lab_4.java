import java.lang.*;

abstract class Shape
{
 int height, width;

 Shape(int a, int b)
 {
   height = a;
   width = b;
 }

 Shape(int r)
 {
   width = r;
 } 
 
 abstract void printArea();

 public static void main(String args[])
 {
   Rectangle rect = new Rectangle(10,20);
   Triangle tri = new Triangle(10,20);
   Circle cir = new Circle(10);
   
   rect.printArea();
   tri.printArea();
   cir.printArea();
 }
}

class Rectangle extends Shape
{
  
  Rectangle(int a, int b)
  {
    super(a,b);
  }
  void printArea()
  {
    int area = height*width;
    System.out.println("Area of rectangle: " + area);
  }
}

class Triangle extends Shape
{
  Triangle(int a, int b)
 {
   super(a,b);
 }

  void printArea()
  {
    float area;
    area =(float)0.5*height*width;
    System.out.println("Area of triangle: " + area);
  }
}

class Circle extends Shape
{
  
  Circle(int a)
  {
    super(a);
  }
  void printArea()
  {
    float area = (float)3.14*width*width;
    System.out.println("Area of circle: " + area);
  }
}
  
