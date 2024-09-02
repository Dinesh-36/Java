//Enum is a class in java,which is used to define a named constants 
//Enum can be create outside of the main class or inside the main class
//Note: it does't contain any acess modifier like public,void,private..
//enum accessable:if we create in a main method then it is only accessable in that method

enum Shape {
    RECTANGLE(4), CIRCLE, SQUARE; // The naming conversion of constants is in UpperCase';'is optional'//object
                                  // creation is done at this line

    private int sides;

    private Shape() { // we are making constructor as private because object is defined inside the
                      // enum
        System.out.println("Constructor Called");
    }

    private Shape(int i) {
        sides = i;
        System.out.println("Constructor Called" + sides);
    }

    public int getsides() {
        return sides;
    }
}

public class Enum {
    public static void main(String[] args) {
        System.out.println(Shape.RECTANGLE);

        Shape obj = Shape.CIRCLE;
        Shape obj1 = Shape.RECTANGLE;

        System.out.println(obj);
        System.out.println(obj1);

        System.out.println(obj.ordinal());// it gives the position(Rectangle(0),Cir(1),Squ(2))
        System.out.println(obj1.ordinal());// it gives the position(Rectangle(0),Cir(1),Squ(2))

        Shape obj2[] = Shape.values();
        for (Shape val : obj2) {
            System.out.println(val);
        }
        // Comparing constants using if else and switch
        if (obj == Shape.CIRCLE)
            System.out.println("no sides");
        else if (obj1 == Shape.RECTANGLE)
            System.out.println("four sides");
        else
            System.out.println("something going erong");

        switch (obj1) {
            case RECTANGLE:
                System.out.println("four sides");
                break;

            default:
                System.out.println("something going erong");
                break;
        }

        // enum class
        System.out.println(obj.getClass());
        System.out.println(obj.getClass().getSuperclass());

        // behind the enum Shapes
        class Shape {
            static final Shape RECTANGLE = new Shape();// when ever a object is created if there is a default
                                                       // constructor then it will executes automatically executes
            static final Shape CIRCLE = new Shape();
            static final Shape SQUARE = new Shape();
        }

        System.out.println(obj.getsides());

    }
}
