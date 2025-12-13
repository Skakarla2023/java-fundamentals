# Thread LifeCycle

- The thread life cycle describes the different states a thread goes through from creation to termination during its execution in a Java program.
- Java defines these states in the Thread.State enum.
- A thread can be in 6 states:
  1. NEW
  2. RUNNABLE
  3. BLOCKED
  4. WAITING
  5. TIMED_WAITING
  6. TERMINATED
 
<img width="800" height="370" alt="image" src="https://github.com/user-attachments/assets/36f1639d-4740-4f7f-b8f3-f1de9ff729c3" />


### 1. NEW state

Meaning

- A thread is in the NEW state after creation but before starting.
- The thread object exists, but no system resources are allocated yet.

How it enters

- When you create a thread using new Thread().

Important point

- start() has not been called yet.

```java
Thread t = new Thread();
```

### 2. RUNNABLE state

Meaning

- The thread is ready to run or currently running.
- The CPU may or may not be executing it at this exact moment.

How it enters

- When start() is called.
- When a blocked/waiting thread becomes ready again.

Important point

- Java does not separate “ready” and “running” states.
- Both are combined into RUNNABLE.

```java
t.start();
```

### 3. BLOCKED state

Meaning

- The thread is waiting to acquire a lock (monitor).
- Another thread is already using the required synchronized resource.

How it enters

- When a thread tries to enter a synchronized block or method
- But the lock is already held by another thread

```java
synchronized(obj) {
    // if another thread has the lock,
    // this thread goes to BLOCKED
}
```

### 4.WAITING state

Meaning

- One thread is indefinitely waiting for another thread to perform some action.
- It will not run until it's explicitly notified.

How it enters
- Calling:
  - wait()
  - join() (without timeout)
 
```java
obj.wait();
t.join();
```

How it leaves

- Another thread calls:
  - notify() or notifyAll()
  - Or the joined thread finishes
 
### 5.TIMED_WAITING state

Meaning

- A thread waits for a finite amount of time.
- After the time expires, the thread automatically moves back to RUNNABLE.

How it enters
- Calling:
  - sleep(time)
  - wait(time)
  - join(time)
 
```java
Thread.sleep(1000);  // TIMED_WAITING
```

#### Difference from waiting

| WAITING            | TIMED_WAITING             |
| ------------------ | ------------------------- |
| Waits forever      | Waits for fixed time      |
| Needs notification | Time expiration is enough |

### 6.TERMINATED state

Meaning
- The thread has completed execution.
- It can never be restarted.

How it enters

- run() method finishes normally
- Or an uncaught exception occurs

```java
public void run() {
    System.out.println("Done");
}  // Thread ends → TERMINATED
```



### Final Summary of flow

```
NEW(Thread t = new Thread());
↓
RUNNABLE(start())
↓
BLOCKED(waiting for lock)
↓
WAITING(wait())
↓
TIMEDWAITING(Thread.sleep(1000))
↓
TERMINATED
```
