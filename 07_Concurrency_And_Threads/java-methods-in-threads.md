# Thread Methods

- Methods in threads are classified into 4.They are:
  1. Thread Lifecycle methods
  2. Thread scheduling methods
  3. Inter-Thread communication methods
  4. Thread information and utility methods
 
## 1. Thread Lifecycle methods

- These methods control the state transitions of a thread (New → Runnable → Running → Waiting → Terminated).

Methods in this catoegory:
  - start()
  - run()
  - join()
  - sleep()
  - interrupt()

```java
class ThreadExample1 extends Thread {
    // run() -> contains the task the thread should perform
    // // JVM calls run() internally when start() is invoked
    @Override
    public void run() {
        try {
            System.out.println("Thread started");

            // sleep() -> pauses the current thread for some time(here 2 sec)
            // moves thread to TIMED_WAITING state
            Thread.sleep(2000);

            System.out.println("Thread finished work");

        } catch (InterruptedException e) {
            // interrupt() → wakes up a sleeping/waiting thread
            System.out.println("Thread was interrupted");
        }
    }
}

public class ThreadMethodsExample {
    public static void main(String[] args) throws InterruptedException {
        ThreadExample1 t = new ThreadExample1();

        // start() → creates a new thread and executes run() in parallel
        // moves thread from NEW → RUNNABLE
        t.start();

        // sleep() in main thread to ensure child thread enters sleep state
        Thread.sleep(1000);

        // interrupt() → sends interruption signal to the thread
        // useful to stop sleep/wait operations
        t.interrupt();

        // join() → main thread waits until 't' completes execution
        // main thread enters WAITING state
        t.join();

        System.out.println("Main thread resumes after child thread finishes");

    }
}
```

### 3. Thread Scheduling Methods

- These methods influence thread execution order, but final control lies with the JVM Scheduler.
- Methods in this category
  - yield()
  - setPriority()
  - getPriority()


```java
class PriorityThread extends Thread {
    public PriorityThread(String name){
        super(name);
    }

    @Override
    public void run(){

        // getPriority()->returns the priority of the current thread
        System.out.println(
            "Thread name: "+ getName() +
            ", Priority: "+ getPriority()
        );

        for(int i=1;i<=3;i++){
            System.out.println(getName() + " executing step "+i);

            // yield() -> hints the scheduler to pause the current thread
            // and give chance to other threads of same or higher priority
            Thread.yield();
        }
    }
}

public class YieldPriorityExample {
    public static void main(String[] args) {
        PriorityThread t1 = new PriorityThread("LowPriorityThread");
        PriorityThread t2 = new PriorityThread("HighPriorityThread");

        // setPriority()->sets the priority of a thread
        // Thread.MIN_PRIORITY = 1
        // Thread.NORM_PRIORITY = 5 (default)
        // Thread.MAX_PRIORITY = 10
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
    }
}
```

### 3. Inter-Thread Communication Methods

- These methods allow threads to coordinate and communicate using a shared object.
- Methods in this category
  - wait()
  - notify()
  - notifyAll()

⚠️ Defined in Object, not Thread


### 4. Thread Information & Utility Methods

- These methods give metadata about threads.

| Method            | Description               |
| ----------------- | ------------------------- |
| `currentThread()` | Returns current thread    |
| `getName()`       | Gets thread name          |
| `setName()`       | Sets thread name          |
| `isAlive()`       | Checks if thread is alive |
| `getId()`         | Returns thread ID         |



#### Deprecated Thread Methods (DO NOT USE)

| Method      | Reason             |
| ----------- | ------------------ |
| `stop()`    | Unsafe termination |
| `suspend()` | Deadlock risk      |
| `resume()`  | Inconsistent state |

