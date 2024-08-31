//Final(variable,Method,class)
//variable --> used to declare as constant
//method-->cannot be overridden
//class-->cannot be inherited

/*final */class One {
    /* final */ void dis() {
        System.out.println("hi");
    }
}

class Two extends One { // cant be inherited because it is declared as final (to see uncomment the
                        // final key word in class One)

    void dis() {// can not override the method which is declared as final (in class One)
        System.out.println("hi");
    }
}

public class FinalkeyWord {
    public static void main(String[] args) {
        int a = 10;
        a = 20;
        System.out.println(a);
        /* final */ int b = 23;/*
                                * cant update the value but we can declare and then we can assign it
                                * eg:final c; c=20 this is possible
                                */
        b = 34;
        System.out.println(b);

    }

}
