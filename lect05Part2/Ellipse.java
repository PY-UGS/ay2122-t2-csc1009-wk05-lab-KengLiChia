package csc1009.src.lect05Part2;

public class Ellipse extends Shape{

    public Ellipse(double a, double b) {
        super(a, b);
    }

    public double area(){
        System.out.println("Inside Area for Ellipse");
        return PI * dim1 * dim2;
    }
}
