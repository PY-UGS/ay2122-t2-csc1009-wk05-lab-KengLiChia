package csc1009.src.lect05;

public class Circle extends GeometricObject {

    private double radius;
  
    public Circle() {
    }
  
    public Circle(double radius) {
      this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
      super(color, filled); //super is to be putted first
      this.radius = radius;
    }
  
    public double getRadius() {
      return radius;
    }
  
    public void setRadius(double radius) {
      this.radius = radius;
    }

    public double getArea(){
      return radius * radius * Math.PI;
    }
   
    public double getPerimeter() {
      return 2 * Math.PI *radius;
    }

    public double getDiameter(){
      return 2 * radius;
    }

    public void printCircle(){
      System.out.println("The circle is created " + getDateCreated() + " and the radius is " + radius);
    }
  }