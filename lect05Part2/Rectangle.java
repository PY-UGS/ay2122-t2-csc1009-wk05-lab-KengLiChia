package csc1009.src.lect05Part2;

public class Rectangle extends Shape{

    public Rectangle(double a, double b) {
        super(a, b);
    }

    public double area(){
        System.out.println("Inside Area for Rectangle");
        return dim1 * dim2;
    }
}
