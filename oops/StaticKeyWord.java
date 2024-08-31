//static is not object dependented
//if we make an variable static that varriable is same for all the object
class Student {
    int age;
    String name;
    static int batch;
    static String schoolName = "Gov High School";
    static String teacher;
    // static block
    // this static block will execute when the class will load
    static {
        Student.teacher = "ravi";
    }

    void display() {
        System.out.println(name + " " + age + " " + batch + " " + schoolName + " " + teacher);
    }
}

public class StaticKeyWord {
    // the thing we are using 'static key word' is it doesn't need a object to
    // execute,it will execut automatically when a class is load so here the 'main'
    // method will execute automatically without the object
    public static void main(String[] args) {
        Student obj1 = new Student();
        Student obj2 = new Student();
        Student obj3 = new Student();
        obj1.age = 22;
        obj1.name = "dinesh";
        obj2.age = 23;
        obj2.name = "din";
        obj2.batch = 2012;// it is same for all object
        Student.batch = 2013;// we can also acess with class
        obj3.age = 22;
        obj3.name = "d";
        obj1.display();
        obj2.display();
        obj3.display();

    }
}
