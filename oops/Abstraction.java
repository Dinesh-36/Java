//hiding the unnessary parts and only showing the necessary parts
//data hiding

//abstract class
abstract class employee {
    abstract void display();
}

// concerete class
class DerivedClass extends employee {
    void display() {
        System.out.println("Abstract method in derived class");
    }

}

public class Abstraction {

    public static void main(String[] args) {
        DerivedClass obj = new DerivedClass();
        obj.display();

    }
}
