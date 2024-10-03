// a class inside a a class is called inner class
//types
//1.Nested inner class
//2.Method Loccal Inner class(a class which is private in a outer class)
//3.Static Nested class
//4.Anonymous inner class

//1.
class Outer {
    public void show() {
        System.out.println("from outer show method");
    }

    class Inner {
        public void disp() {
            System.out.println("from |inner| class disp method");
        }

    }

}

// 3.
class Outer3 {
    public void show() {
        System.out.println("from outer show method");
    }

    static class Inner {
        public void disp() {
            System.out.println("from |Static| inner class disp method");
        }

    }

}

// 3(if the class is private).
class Outer33 {
    public void show() {
        System.out.println("from outer show method");
    }

    private class Inner {
        public void disp() {
            System.out.println("from |Private| inner class disp method");
        }

    }

    public void getAccess() {
        Inner in = new Inner();
        in.disp();
    }

}

// 2.
class Outer2 {
    public void show() {
        System.out.println("from outer show method");
    }

    public void outerMethod() {
        class Inner {
            public void disp() {
                System.out.println("from |Method| inner class disp method");
            }
        }
        Inner in = new Inner();
        in.disp();
    }

}

// 4
class Outer4 {
    public void show() {
        System.out.println("from  show method");
    }
}

public class InnerClass {
    public static void main(String[] args) {
        // to acess a methods in outer class
        Outer obj = new Outer();
        obj.show();
        // 1. to access a method from inner class
        Outer.Inner obj1 = obj.new Inner();// non static class so it is access by object
        obj1.disp();
        // 3. to access static class
        Outer3.Inner obj3 = new Outer3.Inner();// static access by class name
        obj3.disp();
        // 3.to acess a inner private claaa
        // Note:the private inner class can only be accessed within the scope of the
        // outer class.outside the outerclass, the private inner class is not
        // accessable.
        Outer33 obj33 = new Outer33();
        obj33.getAccess();
        // 2.to acess a class which is in a method
        Outer2 obj2 = new Outer2();
        obj2.outerMethod();
        // 4.
        Outer4 obj4 = new Outer4() { // this '{' is a class which has no name and akey word class so it is called as
                                     // ananomous inner class
            public void show() {
                System.out.println("from changed show method");
            }
        };
        obj4.show();

    }
}
