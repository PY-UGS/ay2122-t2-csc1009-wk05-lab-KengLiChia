package csc1009.src.lect05Part2;

public abstract class Shape {

    double dim1;
    double dim2;
    double PI= 3.14;

    public Shape(double a, double b){
        dim1=a;
        dim2=b;
    }

    public abstract double area();
}
