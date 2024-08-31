//polymorphism(same thing in different ways)
//1.compile time(method overloading)
//2.run time (method overriding)

//1.compile time
public class Polymorphism {
    int num1;
    int num2;
    int result;

    void sum(int a, float b) {
        num1 = a;
        num2 = (int) b;
        result = num1 + num2;
        System.out.println(result);
    }

    void sum(int a, int b) {
        num1 = a;
        num2 = (int) b;
        result = num1 + num2;
        System.out.println(result);
    }

    void sum(double a, double b) {
        num1 = (int) a;
        num2 = (int) b;
        result = num1 + num2;
        System.out.println(result);
    }

    void sum(double a, float b) {
        num1 = (int) a;
        num2 = (int) b;
        result = num1 + num2;
        System.out.println(result);
    }

    public static void main(String[] args) {
        Polymorphism pl = new Polymorphism();
        pl.sum(10, 11.23);
        pl.sum(12.3, 22.4);
        pl.sum(33.3, 99.40);
        pl.sum(44.3, 33.22);

    }

}
