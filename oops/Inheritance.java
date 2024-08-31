class A {
    int a;

    void adis() {
        System.out.println("from A" + a);
    }
}

class B extends A {
    int b;

    void bdis() {
        System.out.println("from B" + b);
    }
}

class C extends B {
    int c;

    void cdis() {
        System.out.println("from C" + c);
    }

}

class D extends A {
    int d;

    void cdis() {
        System.out.println("from d" + d);
    }
}

class E extends A {
    int e;

    void cdis() {
        System.out.println("from d" + e);
    }
}

public class Inheritance {

    public static void main(String[] args) {
        B ch = new B();
        ch.a = 10;
        ch.b = 20;
        // 1.single level inheritance
        // A-->B
        // accessing member variable and function from parent class using child class
        System.out.println("Single level Inheritance");
        ch.adis();
        ch.bdis();
        // 2.Multilevel Inheritance
        // A-->B-->c
        System.out.println("Multi Level Inheritance");
        C obj = new C();
        obj.a = 30;
        obj.b = 40;
        obj.c = 50;
        obj.adis();
        obj.bdis();
        obj.cdis();
        // 3.Hierarchical Inheritance
        // two class extends super class
        D objd = new D();
        E obje = new E();
        objd.adis();
        obje.adis();
        // 4.Multiple Inheritance is not supporded directly because compiler doesn't
        // know which parent class to execut,to achive multiple inheritance there is a
        // concept 'Interface'
    }

}
