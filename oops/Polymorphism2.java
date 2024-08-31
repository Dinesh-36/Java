//polymorphism(same thing in different ways)
//1.compile time(method overloading)
//2.run time (method overriding)
// Achieved by inheritance concept
//Rules:1)Both super & sub class 'methods' should be having same name.2)static & final methods cannot be overridden

//2.run time
class Parent {
    void show() {
        System.out.println("from parent");
    }

}

class Child extends Parent {
    void show() {
        System.out.println("from child");
    }
}

public class Polymorphism2 {

    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();// here it over rides itd parent method(show) and execute its member
                   // methos(show)
    }
}