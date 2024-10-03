//interface is like Class but not a class
//interface provides a design so that we can build it with class
//we cant create a object for interface but we can take as a reference (A obj = new Aimp();)
//instead of class key word we use Interface
//it has varibles and methods but not have a constructor
//variables are by default 'Static and final'
//methods-only abstract methods(only declaration)
//Note:In Abstract class there will be a Abstract method and also a normal methods but in 'interface' it only have 'Abstract Methods' not a 'normal Methods'

//class to class ->extends
//class to interfacce ->implements
//interface to interface ->extends

interface A {
    int age = 23;// static and final(by default)

    void show();// even if u dont mention a method is 'Abstract' by default it takes as a
                // 'Public Abstract' Method(Public Abstract void show();) in Interface
                // we need to implement these methods in seperate class, here only declaration

    void disp();
}

// Note: to inherit interface want to use 'implements key word'

class Aimp implements A {
    // we need to implement all the methods which are declared in interface other
    // wise it shows 'error'
    public void show() {
        System.out.println("In show");
    }

    public void disp() {
        System.out.println("In disp");
    }
}

// Abstract Class and Method
abstract class B {
    abstract void display();// abstract method

    void show() {// normal method

    }

}

public class Interface {
    public static void main(String[] args) {
        Aimp obj = new Aimp();
        obj.disp();
        obj.show();
        System.out.println(A.age);// we dont need to create a object to access a variable in interface beause it
                                  // is by default static
    }
}
