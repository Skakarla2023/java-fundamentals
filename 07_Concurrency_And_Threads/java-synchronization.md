# Synchronization in Java

- Synchronization in Java is a mechanism that ensures that only one thread can access a shared resource (like a variable, object, or method) at a time.
- It prevents concurrent threads from interfering with each other while modifying shared data.

### Why is Synchronization needed?

1. To prevent Data inconsistency
2. Avoid Race conditions
3. Maintains Thread Safety
4. Ensures Data Integrity

## Ways to Achieve Synchronization 

<img width="800" height="288" alt="image" src="https://github.com/user-attachments/assets/4ed1bf9c-9c9a-45fd-8260-b517bdff3c9d" />


### 1. Synchronized Methods

A synchronized method ensures that only one thread can execute it at a time on the same object instance

```java
class Counter {

    // shared variable
    private int c = 0;

    // Synchronized method to increment counter
    public synchronized void inc(){
        c++;
    }

    // Synchronized method to get counter value
    public synchronized int get(){
        return c;
    }
}
public class SynchronizationExample {
    public static void main(String[] args){
        Counter c = new Counter();

        Thread t1 = new Thread(()->{
            for(int i=0;i<1000;i++)
                c.inc();
        });

        Thread t2 = new Thread(()->{
            for(int i=0;i<1000;i++)
                c.inc();
        });

        t1.start();
        t2.start();


        try {
            t1.join();
            t2.join();
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Counter: "+c.get());
    }
}
```

> Instead of manually writing all the boilerplate by creating a new class that implements Runnable, we use a lambda expression. This makes the code shorter, cleaner, and easier than the traditional approach.

### 2. Synchronized Blocks

Instead of synchronizing an entire method , Java allows synchronization of only necessary blocks,this improves the performance by locking only the necessary condition.

```java
class SynchronizedBlock {
    private int c = 0;

    public void inc() {
        synchronized (this) {
            c++;
        }
    }

    public int get() {
        return c;
    }
}

public class SynchronizedBlockExample {
    public static void main(String[] args) throws InterruptedException {
        SynchronizedBlock s = new SynchronizedBlock();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100; i++)
                s.inc();
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 100; i++)
                s.inc();
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Counter: " + s.get());

    }
}
```

The synchronized block ensures mutual exclusion only for the increment statement, reducing the locking overhead.


### 3. Static Synchronization

Static synchronization is used to synchronize static methods. In this case, the lock is placed on the class object rather than the instance.

```java
class Table {
    synchronized static void printTable(int n) {
        for (int i = 1; i <= 3; i++) {
            System.out.println(n * i);

            try {
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class Thread1 extends Thread {
    public void run() {
        Table.printTable(1);
    }
}

class Thread2 extends Thread {
    public void run() {
        Table.printTable(10);
    }
}

class SSE {
    public static void main(String[] args) {
        Thread t1 = new Thread1();
        Thread t2 = new Thread2();
        t1.start();
        t2.start();
    }
}
```

 Both threads t1 and t2 call the static synchronized method printTable(). The lock is applied to the Table.class object, ensuring that only one thread can access the method at a time, even if no object instance is shared.

 
