/*
 * i)Normal Interface(more than one method)
 * ii)Functional Interface with lambda expression(1 method)-SINGLE ABSTRACT METHOD(SAM)Interface
 * iii)Marker Interface(Serializable)(0 methods) 
 * 
 * 
 * 
 * 
 */

//ii)Functional Interface
// Note: in FI we can have any number of 'static and default methods'(declare and define) but should not have more than one abstract method(only declare)

@FunctionalInterface // annotation which helps to maintain the syntax,here the functional interface
                     // should contain only one method if we forget this syntax and by mistakely
                     // creare an more than one methos this annotation shows a error
interface MyInterface {
    void display();

}

// class MyInterfaceImp implements MyInterface {
// public void display() {
// System.out.println("in display");
// }
// }
// Note:why ananomous class?
// if a class which has a single purpose only in above the class
// 'MyInterfaceImp' has a only implementation of a single method so at this case
// we can use this Ananomous class,because for every class java produce a .class
// fileit take memory and effort so to avoid this we are using annonamous inner
// class

// Lambada Experision (->) short hand for writing annanomous class
// this only works in Functional Interface
interface MyInterface2 {
    void show();
}

interface MyInterface3 {
    int add(int i, int j);
}

public class InterfaceTypes {
    public static void main(String[] args) {
        MyInterface obj = new MyInterface() {// it is not a object for MyInterface class it is a object for ananomous
                                             // inner class object '{public void display(){}}'-->this is a block without
                                             // a class in insiade a another class so it is called ananomous inner class

            public void display() {
                System.out.println("in display");
            }
        };
        obj.display();

        MyInterface2 obj2 = () -> System.out.println("in show");
        obj2.show();

        MyInterface3 obj3 = (i, j) -> i + j;// if the statement is in single line then we dont need a return keyword
        int res = obj3.add(2, 4);
        System.out.println(res);
    }
}
