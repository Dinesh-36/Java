//hiding the unnessary parts and only showing the necessary parts
//data hiding

//abstract method
//if you dont want to define a method you are only defining a method means you need to make a method as abstract

//abstract class
abstract class employee {
    abstract void display();// abstract methods should be only in abstract class
}

// concerete class
class DerivedClass extends employee {
    void display() {// if you extends an abstract class you need to define the method which is only
                    // declared in parent class
        System.out.println("Abstract method in derived class");
    }

}

public class Abstraction {

    public static void main(String[] args) {
        // employee obj= new employee(); you cant create a object for abstract class
        employee obj2 = new DerivedClass();// but you can create a reference of abstract class
        obj2.display();// Dynamic method dispatch(concept in physical notebook)
        DerivedClass obj1 = new DerivedClass();
        obj1.display();

    }
}
