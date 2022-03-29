package csc1009.src.lect05;

interface Inter1 {
    int one = 1;
    public void show1(int i);
}

interface Inter2 {
    int two = 2;
    public void show2(int i);
}

interface Inter3 {
    int three = 3;
    public void show3(int k);
}


interface TriInterface extends Inter1, Inter2, Inter3 {
    public int showSum();
}

public class ImplementShow implements TriInterface
{
    public void show1(int i) {
        System.out.print(i + " from Inter1, ");
    }

    public void show2(int j) {
    System.out.print(j + " from Inter2, and ");
    }

    public void show3(int k) {
        System.out.print(k + " from Inter3 = ");
    }

    public int showSum() {
        return one + two + three;
    }

    public static void main(String[] args) {
        ImplementShow is = new ImplementShow();
        System.out.print("The sum of ");
        is.show1(one);
        is.show2(two);
        is.show3(three);
        System.out.println(is.showSum());
    }
}