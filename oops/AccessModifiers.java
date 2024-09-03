//Public,Private,Default(it is also known as Package Private),Protected

class Stu {// if in a class there is no modifer then it is by default
           // "Default"AcessModifier
           // Note:We cant make a outer class as 'Private & Protected' it is allowed only
           // for
           // 'Public,abstract,final or default'

    // Inner class can be either Private or Protected is allowed
    protected class Inner {
        public void show() {
            System.out.println("hellow");
        }
    }

    // If it is private we cant access it outside of the class so that we create a
    // seperate method within a same class which is public so that we can access
    // that private class out side the class by that public method
    private class InnerPrivate {
        public void disp() {
            System.out.println("hellow");
        }
    }

    public void method() {
        InnerPrivate ip = new InnerPrivate();
        ip.disp();
    }

}

public class AccessModifiers {
    public static void main(String[] args) {// Note:We cant make a outer class as 'Private & Protected' it is allowed
                                            // only for
        // 'Public,abstract,final'

        // if the outer class is default we can acess it in same package but we cant
        // access it in another package(we cant import it)

        Stu obj = new Stu();
        Stu.Inner in = obj.new Inner();
        in.show();
        obj.method();

    }
}
