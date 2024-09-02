//Thread safe (synchronization keyword)
//why synchronization?
//'to avoid' both threads concurrently(at same time) accessing the 'same method' at 'same time'
//if we make a method as synchronizes then if the thread t1 is acessing the method then t2 will wait untill t1 completes its execution in that method same for t2,it will avoid the accessing of method at same time, becauce if we accesing the methods at same time it will leads to error based on the code inside that method

class Counter {
    private int count;

    public synchronized void increment() {
    }

    public int getCount() {
        return count;
    }

}

public class ThreadSynchronizaton {
    public static void main(String[] args) throws InterruptedException {
        Counter obj = new Counter();
        System.out.println("Before Increment: " + obj.getCount());

        Thread t1 = new Thread(() -> {// after t1 thread starts this part will executed by t1 thread
            for (int i = 0; i < 4; i++) {
                obj.increment();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });
        t1.start();// main thread create and starts this thread t1
        try {
            Thread.sleep(500);
        } catch (Exception e) {
            // TODO: handle exception
        }
        Thread t2 = new Thread(() -> {// after t1 thread starts this part will executed by t1 thread
            for (int i = 0; i < 4; i++) {
                obj.increment();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });
        t2.start();// main thread create and starts this thread t2
        t1.join();
        t2.join();

        System.out.println("After Increment: " + obj.getCount());

    }

}
