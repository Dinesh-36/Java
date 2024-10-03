//Achived by inheritance concept
//Used to access immediate parent class variable,methods and constructors from derived/child class
//Note:Name of Base class and derived class variables, methods and constructors should be same
//Note:default constructor executes automatically when a object is created, the order of execution is from parent to child because every constructor by default have a super() it means call a constructor of super class; so that it will first executes its parent constructor and then it execute its own constructor
//Note:if it is a method which has same name in parent and child at that time if we create a object for child and call that method it will override the parent method and execut its own method(child),if we want to execute the parent class first user super keyword in clild class method

class Parent {
    int a = 20;

    public Parent() {

        // super(); default
        System.out.println("Parent class Constructor");
    }

    public void display() {

        System.out.println("parent");
    }

}

class Child extends Parent {
    int a = 30;

    public Child() {

        // super(); default
        System.out.println("child class constructor");
    }

    public void display() {

        super.display();// by using this super key word we can acess the method of super class first and
                        // then own class
        System.out.println("child" + super.a);// to acess a super class variable
    }

}

public class SuperKeyWord {
    public static void main(String[] args) {
        Child obj = new Child();

    }
}
