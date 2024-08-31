class calc {
    int rollno;
    static String name;
    int mark;
    String lname;
    static {
        name = "dinesh";
    }

    public void fun() {
        System.out.println("non-static variable from non-static method :  " + mark);
    }

    public static void fun1(calc obj1) {
        System.out.println(
                "accessing  static method dynamically by passing the object as an  arugument to access the non-static variables  :"
                        + obj1.rollno);
        System.out.println(" static variable in static method:" + name);

    }
}

public class staticvariable {
    public static void main(String a[]) {

        calc obj1 = new calc();
        obj1.mark = 100;
        obj1.rollno = 1;
        System.out.println("acessing the static varriable in main method :" + calc.name);
        obj1.fun();
        calc.fun1(obj1);

    }

}
