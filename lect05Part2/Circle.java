package csc1009.src.lect05Part2;

public class Circle extends Shape{

    public Circle(double a, double b) {
        super(a, b);
    }

    public double area(){
        System.out.println("Inside Area for Circle");
        return PI * dim1 * dim2;
    }
}
