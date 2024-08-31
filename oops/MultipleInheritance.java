//We can achive Multiple Inheritance with Interface

interface Parent1 {
    void disp();
}

interface Parent2 {
    void disp();

    void show();

}

class Child implements Parent1, Parent2 {
    public void disp() {
        System.out.println("In display from child");
    }

    public void show() {
        System.out.println("In show from child");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.disp();
        obj.show();

    }
}
