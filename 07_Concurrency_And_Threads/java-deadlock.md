# Deadlock in Java Multithreading

- Deadlock occurs in Java when multiple threads block each other while waiting for locks held by one another.
- To prevent deadlocks, we can use the synchronized keyword to make methods or blocks thread-safe which means only one thread can have the lock of the synchronized method and use it, other threads have to wait till the lock releases other one acquires the lock.


  <img width="800" height="400" alt="image" src="https://github.com/user-attachments/assets/82aa0604-14b4-4e38-bfb6-e5197958ceb1" />

### Deadlock Conditions(Coffman conditions)

A deadlock occurs only if all four conditions are true simultaneously.

1. **Mutual Exclusion**

A resource can be held by only one thread at a time

Example: object lock via synchronized

2. **Hold and Wait**

A thread holds one resource and waits for another

3. **No Preemption**

Resources cannot be forcibly taken

Thread must release lock voluntarily

4. **Circular Wait**

A circular chain of threads exists

T1 → T2 → T3 → T1

Break any one condition → deadlock is prevented


### Deadlock vs Starvation vs LiveLock

| Issue      | Meaning                                      |
| ---------- | -------------------------------------------- |
| Deadlock   | Threads wait forever for each other          |
| Starvation | A thread never gets CPU or resources         |
| Livelock   | Threads keep responding but make no progress |


### Preventing Deadlocks

We can avoid deadlock conditions by knowing its possibilities. It's a very complex process and not easy to catch. Still, if we try, we can avoid this. There are some methods by which we can avoid this condition. We can't completely remove its possibility but we can reduce it.
- **Avoid Nested Locks** : This is the main reason for deadlock. Mainly happens when we give locks to multiple threads. Avoid giving lock to multiple threads if we already have given to one.
- **Avoid Unnecessary Locks** : We should have lock only those members who are required. Having a lock on unnecessarily can lead to deadlock.
- **Using thread join** : Deadlock condition appears when one thread is waiting for the other to finish. If this condition occurs we can use Thread. Join the with the maximum time you think the execution will take.
