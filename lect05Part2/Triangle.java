package csc1009.src.lect05Part2;

public class Triangle extends Shape{

    public Triangle(double a, double b) {
        super(a, b);
    }

    public double area(){
        System.out.println("Inside Area for Triangle");
        return dim1 * dim2/2;
    }
}
