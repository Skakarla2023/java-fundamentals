# Threads in Java

- In Java, a thread is the smallest unit of execution within a process that runs independently and concurrently with other threads.
- This capability, known as multithreading, allows programs to perform multiple tasks simultaneously, leading to improved performance and responsiveness, especially in applications with time-consuming operations like network communication or complex computations.


### Why do we use Threads?

1. Running multiple tasks independently.
2. To improve performance and responsiveness by allowing a single process to perform multiple tasks concurrently.
3. Because threads share the same memory space, they can exchange data directly and quickly without needing the slower inter-process communication mechanisms required between separate processes.
4. Switching between threads is generally faster than switching between processes because threads have the same address space, so the operating system doesn't need to perform as many memory-related updates.

### How to create Threads in Java?

There are two main ways:

1. By extending the Thread class:

```java
class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread running: " + Thread.currentThread().getName());
    }
}

public class Main {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();    // NEVER call run() directly
    }
}
```


2. By implementing the Runnable interface

```java
class MyTask implements Runnable {
    public void run() {
        System.out.println("Runnable running: " + Thread.currentThread().getName());
    }
}

public class Main2 {
    public static void main(String[] args) {
        Thread t = new Thread(new MyTask());
        t.start();
    }
}
```


