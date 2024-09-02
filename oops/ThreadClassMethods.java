//join(),to wait the main thread execution untill the threads we created completes its execution

//isAlive(),to check the status of thread which is currently alive or not(executing or not)

//getName(),by default the name is starts from 0,1,2 for the threads the thread which is created first is 0,second thread is 1 and so on.(t1.getName()->0,t2.getName()->1)

//setName(),if we want to change the name of the thread then use setName()method(t2.setName("MyThread"),it accepts string only("")),we can set this name at the creation of thread,thread first argument as a runnable object and then we give our thread name as a second argument in 'string'.

//getPriority(),to see the priority of our thread(t1.getPriority())

//setPriority(),it suggest the cpu scheduler which one to executes first.In CUP there is a "SCHEDULER" if we have a two threads these two thread reach Scheduler at same time,then the scheduler dont know which one to execute at first so at that time cpu takes randomly one thread and executes.so if we want to make one thread high priority than other we can set it by using 'setPriotity()'the priotity starts scale from 1-10,1 is minimum priority,5->is normal priority(it is default),10->is high Priority(t2.setPriority(10)),we can also use instance variable to set these priority those are "MIN_PRIORITY,NORM_PRIORITY,MAX_PRIORITY"
//sleep()

public class ThreadClassMethods {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {// after t1 thread starts this part will executed by t1 thread
            for (int i = 0; i < 4; i++) {
                System.out.println("Hi");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });
        t1.start();// main thread create and starts this thread
        try {
            Thread.sleep(500);
        } catch (Exception e) {
            // TODO: handle exception
        }
        Thread t2 = new Thread(() -> {// after t1 thread starts this part will executed by t1 thread
            for (int i = 0; i < 4; i++) {
                System.out.println("Hellow");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });
        t2.start();// main thread create and starts this thread

        System.out.println("Main Thread execution : Good Morning");// main thread executes this
        // to execute something after completion of thread call join method with that
        // thread 't1.join()'
        System.out.println("t1 is alive : " + t1.isAlive());
        System.out.println("t2 is alive : " + t2.isAlive());
        t1.join();
        System.out.println("t1 is alive : " + t1.isAlive());
        t2.join();
        System.out.println("After the execution of t1 and t2 thread : Good Morning");
        System.out.println("t2 is alive : " + t2.isAlive());
        // isAlive

    }
}
