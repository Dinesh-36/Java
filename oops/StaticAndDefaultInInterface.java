// abstract class - declare and define methods
// interface - only method declaration

interface Wierd {
    default void show() {
        System.out.println("in show");
    }

    static void show1() {
        System.out.println("in show");
    }

    void display();
}

class WierdImp implements Wierd {
    public void display() {
    }
}

public class StaticAndDefaultInInterface {
    public static void main(String[] args) {
        Wierd obj = new WierdImp();
        obj.show();
        Wierd.show1();

    }
}
