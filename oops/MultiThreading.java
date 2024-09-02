// What is Multithreading
//running multiple tasks(Processes) at a same time
//Note:by default in our java program it has one single thread which is main method

// Implementing Multithreading in Java
//i) Using Thread class
//ii) Using Runnable Interface(Functional Interface)

//i)
class Hii {
    public void disp() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Hii");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Hellow {
    public void disp() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Hellow");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// To convert a normal class into Thread 'extends Thread'
class Welcome extends Thread {
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Welcome");
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Home extends Thread {
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Home");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// to implement multiple inheritance in thread there is an interface called
// 'Runnable' Interface
class Car implements Runnable {
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Hellow World");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class MultiThreading {
    public static void main(String[] args) {
        Hii obj1 = new Hii();
        // Hellow obj2 = new Hellow();

        obj1.disp();
        // obj2.disp();

        // thread
        Welcome threadObj1 = new Welcome();// now this object have access to thread class so that we can use ther method
        // we need to start this thread by calling 'start()'method from 'Thread' class
        threadObj1.start();
        // then this start method by default it calls 'run()' method so make a method
        // name as 'run'

        Home threadObj2 = new Home();
        threadObj2.start();

        // multipleInheritance in threads
        Runnable obj3 = new Car();

        Thread threadobj3 = new Thread(obj3);// it accept a runnable object so that we can run a 'run()'method
        threadobj3.start();
        // using lamada expression
        Thread threadobj4 = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                System.out.println("Hellow World333");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        threadobj4.start();

    }
}
