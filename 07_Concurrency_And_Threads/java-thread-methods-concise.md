### yield()

- Suggests the scheduler that the the thread is willing to pause and other threads with equal priority can execute.

### suspend()

- pauses the thread undefinitely until resume() is called.
- This method is deprecated because it causes deadlocks.

### wait()

- Makes the current thread pause execution,release the object's lock(monitor) and enter a waiting state.
- This thread remains in this state until another thread calls **notify()** or **notifyAll()**.

### notify()

- Notifies thread that is waiting on the same object's monitor.
- When notify is called,the thread does not immediately move to running state, it moves from waiting to **blocked**.
- It waits until the notifying thread exits the synchronized block.
- It Competes with other threads to re-acquire the same lock
- Only then resume execution after the wait() line

### notifyAll()

- Wakes up all threads that are waiting on the same object's monitor. All awakened threads compete to re-acquire the lock, and only one will acquire it and proceed at a time.


# Object Monitor

- It is a synchronization mechanism in **Java**.
- Every Java object has one monitor.
- It ensures that only one thread at a time can run code that is synchronised on that object.

### ⚙️ How It Works

**1.Thread enters synchronized block/method**

- The thread requests the object’s monitor.
- If the monitor is free, the thread acquires it and runs the code.
- If another thread already holds the monitor, the new thread must wait until it’s released.
  
**2.Thread executes critical section**

- The monitor guarantees exclusive access to shared resources.
- Example: updating a shared variable safely.
  
**3. Thread exits synchronized block/method**
- The monitor is released.
- Other waiting threads can now acquire it.



> When a thread enters a synchronized block, it acquires the object’s monitor.
Other threads trying to enter the same block become BLOCKED.
If a thread calls wait(), it releases the monitor and enters the object’s wait set.
When notify() is called, one waiting thread is chosen by the JVM and moved to the BLOCKED state.
That thread resumes execution only after re-acquiring the monitor.
